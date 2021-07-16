package com.youngbean7.config;

import com.youngbean7.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public User user() {
        return new User();
    }
}
