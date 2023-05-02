package com.example.spring44;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.*")
@EnableJpaRepositories(basePackages = "com.*")
@SpringBootApplication (scanBasePackages = "com.*")

public class Spring44Application {

    public static void main(String[] args) {
      //  SpringApplication.run(Spring44Application.class, args);
        System.out.println("hello");
    }

}