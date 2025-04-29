package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        return "sp-list";
    }

    @GetMapping("/allsp/test-list")
    public String showTestListPage() {
        return "sp-list"; // Return the view name for sp-list.html
    }

    @GetMapping("/allsp/submit-list")
    public String showSubmitListPage() {
        return "sp-list"; // Return the view name for sp-list.html
    }

    @GetMapping("/adjustsp/{planId}")
    public String showAdjustPage(@PathVariable String planId, Model model) {
        // You can optionally add the planId to the model if the view needs it directly
        // model.addAttribute("planId", planId);
        return "adjustSP"; // Directly return the view name for adjustSP.html
    }
}
