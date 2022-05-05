package com.itenas.rpl.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.itenas.rpl.spring.data",
    "com.itenas.rpl.spring.data.service"})
public class ComponentConfiguration {

    /**
     *
     * @ComponentScan Selain dapat mangambil class dengan anotasi @Component, ia juga dapat mengambail class dengan anotasi @Configuration
     */
}
