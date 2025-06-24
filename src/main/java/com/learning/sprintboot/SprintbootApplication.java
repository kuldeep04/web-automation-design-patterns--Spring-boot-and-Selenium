package com.learning.sprintboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.learning.sprintboot.pages.google", "com.learning.sprintboot.*"})
public class SprintbootApplication {

    public static void main(String[] args){
        SpringApplication.run(SprintbootApplication.class, args);
    }

}
