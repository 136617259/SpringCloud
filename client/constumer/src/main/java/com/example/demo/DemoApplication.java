package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoApplication {

    @LoadBalanced
    @Bean
    public RestTemplate get() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
    }

}
