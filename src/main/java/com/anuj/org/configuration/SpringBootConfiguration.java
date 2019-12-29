package com.anuj.org.configuration;

import com.anuj.org.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.anuj.org")
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class SpringBootConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfiguration.class,args);
    }
}

