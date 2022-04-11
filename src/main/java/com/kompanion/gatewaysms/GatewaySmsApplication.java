package com.kompanion.gatewaysms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class GatewaySmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewaySmsApplication.class, args);
    }

    @Bean
    RestTemplate getrestTemplate(){
        return new RestTemplate();
    }
}
