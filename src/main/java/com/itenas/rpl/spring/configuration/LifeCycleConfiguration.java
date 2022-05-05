package com.itenas.rpl.spring.configuration;

import com.itenas.rpl.spring.data.connection.Cloud;
import com.itenas.rpl.spring.data.connection.Connection;
import com.itenas.rpl.spring.data.connection.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server() {
        return new Server();
    }

    @Bean
    public Cloud cloud() {
        return new Cloud();
    }

}
