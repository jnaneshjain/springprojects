package com.example.profile.demoProfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rest/hello")
public class HelloController {


    @Value("${spring.message}")
    private String message;

    @GetMapping
    public String hello() {
        return message;
    }


}
