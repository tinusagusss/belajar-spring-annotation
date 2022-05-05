package com.itenas.rpl.spring.data;

import com.itenas.rpl.spring.data.service.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getLatihan() {
        return "Latihan Push Up Sebanyak 10 kali";
    }

    @Override
    public String getLayananMotivasi() {
        return fortuneService.getLayananMotivasi();
    }

}
