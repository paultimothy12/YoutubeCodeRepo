package com.timothy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
public class SpringMvcThymeLeafApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcThymeLeafApplication.class, args);
    }
}
