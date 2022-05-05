package com.itenas.rpl.spring.lifeCycle;

import com.itenas.rpl.spring.configuration.LifeCycleConfiguration;
import com.itenas.rpl.spring.data.connection.Cloud;
import com.itenas.rpl.spring.data.connection.Connection;
import com.itenas.rpl.spring.data.connection.Server;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void inisialisasi() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    /**
     * Penghancuran atau penutupan terhadapat bean dapat dilakukan dengan method close() atau menggunakan registerShutdownHook()
     */
//    @AfterEach
//    void menghancurkan() {
//        context.close();
//    }
    @Test
    void testImplementMethod() {
        Connection connection = context.getBean(Connection.class);
        Assertions.assertNotNull(connection);
    }

    @Test
    void testLifeCycleAnnotationBean() {
        Server server = context.getBean(Server.class);
        Assertions.assertNotNull(server);
    }

    @Test
    void testLifeCycleAnnotation() {
        Cloud cloud = context.getBean(Cloud.class);
        Assertions.assertNotNull(cloud);
    }

}
