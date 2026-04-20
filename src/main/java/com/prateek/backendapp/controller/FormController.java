package com.prateek.backendapp.controller;

import com.prateek.backendapp.model.FormRequest;
import com.prateek.backendapp.response.FormResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FormController {

    @GetMapping("/test")
    public String testApi() {
        return "Backend is working";
    }

    @PostMapping("/submit")
    public FormResponse submitForm(@RequestBody FormRequest request) {
        return new FormResponse("Thankyou detail submitted");
    }
}