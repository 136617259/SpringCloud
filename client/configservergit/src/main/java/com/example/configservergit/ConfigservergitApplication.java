package com.example.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigservergitApplication {
//    http://localhost:1201/config-client/dev/master
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigservergitApplication.class).web(true).run(args);
    }

}
