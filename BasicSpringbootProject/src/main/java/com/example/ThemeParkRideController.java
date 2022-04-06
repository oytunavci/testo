package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ThemeParkRideController {
   
    @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRides() {
        return "omglol";
    }
}