package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/")
    public String home() {
        return "Home page";
    }

    @GetMapping("/Login")
    public String login() {
        return "Login page";
    }

    @GetMapping("/Demo")
    public String demo() {
        return "Demo page";
    }

    @GetMapping("/Admin")
    public String admin() {
        return "Admin page";
    }
}
