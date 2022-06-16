package com.shop.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({@PropertySource("classpath:properties/env.properties")}) //classpath 는 src/main/resource임.
public class PropertiyConfig {
}
