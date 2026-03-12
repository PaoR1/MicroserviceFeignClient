package com.globant.feign.client.infrastructure.adapter.output.calluser.configuration;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserClientConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    Request.Options options() {
        return new Request.Options(5000, 30000); // Configurable connect/read timeouts
    }
}