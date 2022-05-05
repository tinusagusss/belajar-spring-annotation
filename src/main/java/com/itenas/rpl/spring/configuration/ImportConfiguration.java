package com.itenas.rpl.spring.configuration;

import com.itenas.rpl.spring.data.Coach;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
    BeanDasarConfiguration.class,
    ComponentConfiguration.class
})
public class ImportConfiguration {

}
