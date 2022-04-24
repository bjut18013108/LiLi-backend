package com.example.lilibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "controller")
public class LiLiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiLiBackendApplication.class, args);
    }

}
