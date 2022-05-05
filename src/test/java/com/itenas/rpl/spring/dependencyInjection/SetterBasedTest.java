package com.itenas.rpl.spring.dependencyInjection;

import com.itenas.rpl.spring.configuration.BeansLanjutanConfiguration;
import com.itenas.rpl.spring.data.Coach;
import com.itenas.rpl.spring.data.TrackCoach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterBasedTest {

    @Test
    void testSetter() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeansLanjutanConfiguration.class);

        Coach trackCoach = context.getBean("setTrackCoach", TrackCoach.class);

        Assertions.assertNotNull(trackCoach.getLayananMotivasi());

    }

}
