package com.itenas.rpl.spring.data.connection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Connection siap digunakan");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Connection ditutup");
    }

}
