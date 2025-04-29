package com.example.demo.controller;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class TestSciencePlanController {
    private final OCS ocs = new OCS();

    @GetMapping("/{planId}/test")
    public String testSciencePlan(@PathVariable("planId") int planId) {
        SciencePlan plan = ocs.getSciencePlanByNo(planId);
        String test = ocs.testSciencePlan(plan);
        System.out.println(test);
        return test;
    }
}
