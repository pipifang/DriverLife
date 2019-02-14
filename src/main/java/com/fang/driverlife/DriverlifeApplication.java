package com.fang.driverlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DriverlifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverlifeApplication.class, args);
    }

}

