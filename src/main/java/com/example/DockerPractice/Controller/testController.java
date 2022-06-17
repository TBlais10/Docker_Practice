package com.example.DockerPractice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class testController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello Docker world";
    }

}
