package com.itenas.rpl.spring.importClass;

import com.itenas.rpl.spring.configuration.ImportConfiguration;
import com.itenas.rpl.spring.data.Coach;
import com.itenas.rpl.spring.data.RubyCoach;
import com.itenas.rpl.spring.data.TrackCoach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    @Test
    public void testImportAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ImportConfiguration.class);

        /**
         * rubyCoach diambil dari ComponentConfiguration<\n>
         * trackCoach diambil dari BeanDasarConfiguraion
         */
        Coach rubyCoach = context.getBean(RubyCoach.class);
        Coach trackCoach = context.getBean(TrackCoach.class);

        Assertions.assertNotNull(rubyCoach);
        Assertions.assertNotNull(trackCoach);

    }

}
