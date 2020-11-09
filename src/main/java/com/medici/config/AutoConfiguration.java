package com.medici.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.medici.repository")
@ComponentScan(basePackages = { "com.medici" })
public class AutoConfiguration {

}
