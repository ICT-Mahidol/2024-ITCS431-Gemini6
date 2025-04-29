package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SciencePlanAPIController {

    @GetMapping("/allsp/new")
    public String showCreateSciencePlanPage() {
        return "createSP";
    }

    @GetMapping("/allsp")
    public String showAllSciencePlanPage() {
        return "sp-dashboard";
    }

    @GetMapping("/sp-list.html")
    public String showAllSciencePlanList() {
        return "sp-list";
    }
//
//    @GetMapping("/sp-list.html?status=created")
//    public String showAllCreatedSciencePlanList() {
//        return "/sp-list.html?status=created";
//    }
//
//    @GetMapping("/sp-list.html?status=tested")
//    public String showAllTestedSciencePlanList() {
//        return "/sp-list.html?status=tested";
//    }

    @GetMapping("/adjustSP/{planId}")
    public String showAdjustedSciencePlanPage(@PathVariable String planId) {
        return "redirect:/adjustSP.html?planId=" + planId;
    }

    @GetMapping("/adjustSP.html")
    public String showAdjustedSciencePlanPage() {
        return "adjustSP"; // Return the view name to render adjustSP.html
    }
}
