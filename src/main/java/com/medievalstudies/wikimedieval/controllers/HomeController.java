package com.medievalstudies.wikimedieval.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {
    @GetMapping
    public String returnIndex() {
        return "foi";
    }

}