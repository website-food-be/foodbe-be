package com.example.be.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CommonController {
    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "OK";
    }
}
