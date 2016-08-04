package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.validation.Validator;

@SpringBootApplication
public class DemoApplication {

    @Bean
    public RepositoryRestConfigurer myRepositoryRestConfigurer(@Qualifier("mvcValidator") Validator mvcValidator) {
        return new RepositoryRestConfigurerAdapter();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
