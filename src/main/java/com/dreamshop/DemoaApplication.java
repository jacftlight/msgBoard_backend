package com.dreamshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan("com.dreamshop.mapper")
@SpringBootApplication
@EnableCaching
public class DemoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoaApplication.class, args);
    }

    // Global CORS config
    // @Bean
    // public WebMvcConfigurer corsConfigurer() {
    //     return new WebMvcConfigurer() {
    //
    //         @Override
    //         public void addCorsMappings(CorsRegistry registry) {
    //             registry.addMapping("/api/*").allowedOrigins("http://localhost:3000");
    //         }
    //     };
    // }

}
