package com.example.ticket.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String test(){
        System.out.println("Mars1");
        return "Mars";
    }

}
