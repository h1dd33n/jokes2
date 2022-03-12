package com.jokedata;

import com.jokedata.services.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CustomUserService customUserService() {
        return new CustomUserService();
    }
}
