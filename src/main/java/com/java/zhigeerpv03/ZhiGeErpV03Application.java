package com.java.zhigeerpv03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ZhiGeErpV03Application {

    public static void main(String[] args) {
        SpringApplication.run(ZhiGeErpV03Application.class, args);
    }

}
