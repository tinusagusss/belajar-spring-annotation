package com.itenas.rpl.spring.bean;

import com.itenas.rpl.spring.configuration.BeanDasarConfiguration;
import com.itenas.rpl.spring.data.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansTest {

    @Test
    public void testGetBean() {
        /*
         * Mendefinisikan Application Context dengan class yang telah diberikan anotasi @Configuration
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanDasarConfiguration.class);

        /*
         * Memanggil bean dengan cara menyebutkan nama classnya ataupun beserta nama method
         *
         * @param TrackCoach merupakan tipe bean
         * @param trackCoach merupakan nama bean
         */
        Coach trackCoach = context.getBean(TrackCoach.class);
        Coach trackCoach1 = context.getBean("trackCoach", TrackCoach.class);

        Coach basebaseballCoach = context.getBean(BaseballCoach.class);
        Coach basebaseballCoach1 = context.getBean("baseball", BaseballCoach.class);

        Assertions.assertSame(trackCoach, trackCoach1);
        Assertions.assertSame(basebaseballCoach, basebaseballCoach1);
    }

}
