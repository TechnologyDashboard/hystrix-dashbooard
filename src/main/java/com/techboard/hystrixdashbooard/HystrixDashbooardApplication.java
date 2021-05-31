package com.techboard.hystrixdashbooard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbooardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashbooardApplication.class, args);
    }

}

