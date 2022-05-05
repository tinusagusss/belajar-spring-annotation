package com.itenas.rpl.spring.dependencyInjection;

import com.itenas.rpl.spring.configuration.BeansLanjutanConfiguration;
import com.itenas.rpl.spring.data.BaseballCoach;
import com.itenas.rpl.spring.data.Coach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorBasedTest {

    @Test
    void testConstructor() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeansLanjutanConfiguration.class);

        Coach baseballCoach = context.getBean(BaseballCoach.class);
        Assertions.assertNotNull(baseballCoach.getLayananMotivasi());
    }

}
