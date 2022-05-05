package com.itenas.rpl.spring.scope;

import com.itenas.rpl.spring.configuration.BeansLanjutanConfiguration;
import com.itenas.rpl.spring.data.BaseballCoach;
import com.itenas.rpl.spring.data.BodyBuilderCoach;
import com.itenas.rpl.spring.data.Coach;
import com.itenas.rpl.spring.data.TrackCoach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

    private ApplicationContext contex;

    @BeforeEach
    void inisialisasiApliicationContext() {
        contex = new AnnotationConfigApplicationContext(BeansLanjutanConfiguration.class);
    }

    @Test
    public void testSingletonScopeDefault() {

        Coach bodyBuilderCoach = contex.getBean(BodyBuilderCoach.class);
        Coach bodyBuilderCoach1 = contex.getBean(BodyBuilderCoach.class);

        Assertions.assertSame(bodyBuilderCoach, bodyBuilderCoach1);
    }

    @Test
    public void testSingletonScopeAnnotation() {

        Coach baseballCoach = contex.getBean(BaseballCoach.class);
        Coach baseballCoach1 = contex.getBean(BaseballCoach.class);

        Assertions.assertSame(baseballCoach, baseballCoach1);
    }

    @Test
    public void testPrototypeScopeAnnotation() {

        Coach trackCoach = contex.getBean(TrackCoach.class);
        Coach trackCoach1 = contex.getBean(TrackCoach.class);

        Assertions.assertNotSame(trackCoach, trackCoach1);
    }

}
