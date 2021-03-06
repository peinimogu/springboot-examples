package com.example.springbootcacheehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootcacheehcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcacheehcacheApplication.class, args);
    }

}
