package com.example.profile.demoProfile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("!dev")
@Configuration
public class ConfigClass {

    @PostConstruct
    public void sayHello() {
        System.out.println("Configuration file has been loaded for the dev profile");
    }
}
