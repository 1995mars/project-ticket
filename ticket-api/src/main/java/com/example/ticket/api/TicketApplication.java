package com.example.ticket.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.example.ticket"})
@EnableConfigurationProperties
public class TicketApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TicketApplication.class, args);
    }
}
