package com.exemple.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TestController {


    @GetMapping(value = "/users")
    public String getUsers() {
        return "users";
    }

    @GetMapping(value = "/offers")
    public String getOffers() {
        return "offers";
    }
}
