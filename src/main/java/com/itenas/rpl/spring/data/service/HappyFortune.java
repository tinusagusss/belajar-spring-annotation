package com.itenas.rpl.spring.data.service;


public class HappyFortune implements FortuneService {

    @Override
    public String getLayananMotivasi() {
        return "Hari ini dalah hari keberuntunganmu";
    }

}
