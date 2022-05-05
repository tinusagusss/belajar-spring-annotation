package com.itenas.rpl.spring.data;

import com.itenas.rpl.spring.data.service.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach() {
    }

    @Override
    public String getLatihan() {
        return "Lari Sebanyak 10 kali";
    }

    @Override
    public String getLayananMotivasi() {
        return fortuneService.getLayananMotivasi();
    }

}
