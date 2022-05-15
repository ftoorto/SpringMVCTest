package com.yy.config;

import com.yy.pojo.animal.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig01 {
    @Bean
    public Cat cat(){
        return new Cat();
    }

}
