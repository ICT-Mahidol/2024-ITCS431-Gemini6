package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
