package com.prateek.backendapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.prateek.backendapp")
public class BackendAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendAppApplication.class, args);
    }
}