package com.itenas.rpl.spring.configuration;

import com.itenas.rpl.spring.data.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDasarConfiguration {

    /*
     * secara defualt nama bean akan mengikuti nama method-nya namun,
     * apabila ingin merubah nama sesuai dengan kebutuhan, nama dapat diubah
     * dengan cara memberikan alias seperti pada bean BaseballCoach
     */
    
    @Bean
    public TrackCoach trackCoach() {
        return new TrackCoach();
    }

    @Bean(name = "baseball")
    public BaseballCoach baseballCoach() {
        return new BaseballCoach();
    }

}
