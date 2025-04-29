package com.example.demo.controller;

import com.example.demo.model.SciencePlanRequest;
import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class SciencePlanController {

    private final OCS ocs = new OCS(); // Replace with OCS(true) if necessary
    private String creator;

    @GetMapping("/api/allsp")
    public List<SciencePlan> getAllSciencePlans() {
        List<SciencePlan> plans = ocs.getAllSciencePlans();
        System.out.println("All science plans: " + plans);
        return plans;
    }


    @PutMapping("/api/update/{id}")
    public ResponseEntity<String> updateSciencePlan(@PathVariable int id, @RequestBody SciencePlan sp) {
        ocs.deleteSciencePlanByNo(id);
        ocs.createSciencePlan(sp);
        return ResponseEntity.ok("Science plan created successfully!");
    }


    @PostMapping("/setcreator")
    public String setCreator(@RequestParam String username) {
        this.creator = username; // Set directly from request parameter
        System.out.println("Creator set to: " + this.creator);
        return "Creator set successfully: " + this.creator;
    }

    /**
     * Retrieves the currently set creator's username.
     * @return The creator's username or a message if not set.
     */
    @GetMapping("/getcreator")
    public String getCreator() {
        return this.creator != null ? this.creator : "No creator set yet.";
    }


    @GetMapping("/sp/{id}")
    public SciencePlan getSciencePlanById(@PathVariable int id) {
        try{
            return ocs.getSciencePlanByNo(id);
        } catch (Exception e) {// If no plan is found, return a 404 Not Found response
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Science plan not found");
        }

    }

    @PostMapping("/allsp/new")
    public ResponseEntity<String> createSciencePlan(@RequestBody SciencePlanRequest request) {
        try {
            System.out.println("Received Science Plan Request: " + request);

            SciencePlan sp = new SciencePlan();
            sp.setCreator(this.creator);
            sp.setSubmitter(request.submitter);
            sp.setFundingInUSD(request.fundingInUSD);
            sp.setObjectives(request.objectives);
            sp.setStarSystem(StarSystem.CONSTELLATIONS.valueOf(request.starSystem));
            sp.setStartDate(request.startDate);
            sp.setEndDate(request.endDate);
            sp.setTelescopeLocation(SciencePlan.TELESCOPELOC.valueOf(request.telescopeLocation));

            DataProcRequirement dpr = new DataProcRequirement(
                    request.fileType, request.fileQuality, request.colorType,
                    request.contrast, request.brightness, request.saturation,
                    request.highlights, request.exposure, request.shadows,
                    request.whites, request.blacks, request.hue, request.sharpness
            );
            sp.setDataProcRequirements(dpr);

            ocs.createSciencePlan(sp);
            return ResponseEntity.ok("Science plan created successfully!");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Failed to create science plan: " + e.getMessage());
        }
    }

    @PutMapping("/allsp/{id}/status")
    public ResponseEntity<String> updateSciencePlanStatus(
            @PathVariable int id,
            @RequestParam String status) {

        try {
            // Convert String to ENUM
            SciencePlan.STATUS newStatus = SciencePlan.STATUS.valueOf(status.toUpperCase());

            // Update using OCS
            ocs.updateSciencePlanStatus(id, newStatus);
            SciencePlan updatedPlan = ocs.getSciencePlanByNo(id);

            System.out.println("Updated Plan #" + id + ": " + updatedPlan.getStatus());
            return ResponseEntity.ok("Status updated to " + newStatus);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid status value.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to update status: " + e.getMessage());
        }
    }


}