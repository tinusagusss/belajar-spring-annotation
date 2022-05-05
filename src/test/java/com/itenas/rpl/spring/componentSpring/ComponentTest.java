package com.itenas.rpl.spring.componentSpring;

import com.itenas.rpl.spring.configuration.ComponentConfiguration;
import com.itenas.rpl.spring.data.AerobicsCoach;
import com.itenas.rpl.spring.data.Coach;
import com.itenas.rpl.spring.data.FootballCoach;
import com.itenas.rpl.spring.data.RubyCoach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    
    ConfigurableApplicationContext context;
    
    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }
    
    @Test
    void testGetBean() {
        
        Coach rubyCoach = context.getBean(RubyCoach.class);
        
        Assertions.assertNotNull(rubyCoach);
    }
    
    @Test
    public void testConstructorBased() {
        Coach footbalCoach = context.getBean(FootballCoach.class);
        
        Assertions.assertNotNull(footbalCoach.getLayananMotivasi());
    }
    
    @Test
    public void testSetterBased() {
        
        Coach aerobicsCoach = context.getBean(AerobicsCoach.class);
        
        Assertions.assertNotNull(aerobicsCoach.getLayananMotivasi());
        
    }
}
