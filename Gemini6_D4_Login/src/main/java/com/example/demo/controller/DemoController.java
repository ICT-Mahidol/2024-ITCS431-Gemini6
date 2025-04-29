//package com.example.demo;
//
//import edu.gemini.app.ocs.OCS;
//import edu.gemini.app.ocs.model.SciencePlan;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class DemoController {
//    @CrossOrigin
//    @GetMapping("/allsp")
//    public ArrayList<SciencePlan> getAllSciencePlans() {
//        OCS o = new OCS();
//        System.out.println(o.getAllSciencePlans());
//        return o.getAllSciencePlans();
//    }
//
//    @GetMapping("/sp")
//    public SciencePlan getSciencePlanById(@RequestParam int id) {
//        OCS o = new OCS();
//        List<SciencePlan> plans = o.getAllSciencePlans();
//        for (SciencePlan plan : plans) {
//            if (plan.getPlanNo() == id) {
//                return plan;
//            }
//        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Science plan not found");
//    }
//
//
//}