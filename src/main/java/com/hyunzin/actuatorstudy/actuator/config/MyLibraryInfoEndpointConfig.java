package com.hyunzin.actuatorstudy.actuator.config;

import com.hyunzin.actuatorstudy.actuator.endPoint.custom.MyLibraryInfoEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryInfoEndpointConfig {

    @Bean
    MyLibraryInfoEndpoint myLibraryInfoEndpoint() {
        return new MyLibraryInfoEndpoint();
    }
}
