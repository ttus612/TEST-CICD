package com.example.testcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCicdApplication.class, args);
        System.out.println("Gradle GitHub actions 4tw!");
    }

}
