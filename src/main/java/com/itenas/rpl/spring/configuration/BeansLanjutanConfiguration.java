package com.itenas.rpl.spring.configuration;

import com.itenas.rpl.spring.data.*;
import com.itenas.rpl.spring.data.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansLanjutanConfiguration {

    @Bean
    HappyFortune happyFortune() {
        return new HappyFortune();
    }

    @Bean
    SadFortune sadFortune() {
        return new SadFortune();
    }

    @Bean
    public BodyBuilderCoach bodyBuilderCoach() {
        return new BodyBuilderCoach();
    }

    @Bean
    @Primary
    @Scope("prototype")
    public TrackCoach trackCoach() {
        return new TrackCoach();
    }

    @Bean
    public TrackCoach setTrackCoach(@Qualifier("sadFortune") FortuneService fortuneService) {
        TrackCoach trackCoach = new TrackCoach();
        trackCoach.setFortuneService(fortuneService);
        return trackCoach;
    }

    @Bean
    @Scope("singleton")
    public BaseballCoach baseballCoach() {
        return new BaseballCoach();
    }

    @Bean
    public BaseballCoach baseballCoach(@Qualifier("happyFortune") FortuneService fortuneService) {
        return new BaseballCoach(fortuneService);
    }

}
