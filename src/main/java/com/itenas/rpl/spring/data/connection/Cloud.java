package com.itenas.rpl.spring.data.connection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cloud {

    @PostConstruct
    public void start() {
        System.out.println("Cloud siap digunakan");
    }

    @PreDestroy
    public void stop() {
        System.out.println("Cloud ditutup");
    }
}
