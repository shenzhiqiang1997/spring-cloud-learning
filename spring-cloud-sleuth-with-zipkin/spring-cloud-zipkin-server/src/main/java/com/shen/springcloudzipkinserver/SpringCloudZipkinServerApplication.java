package com.shen.springcloudzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class SpringCloudZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinServerApplication.class, args);
    }
}
