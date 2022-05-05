package com.itenas.rpl.spring.data;

import org.springframework.stereotype.Component;

@Component
public class RubyCoach implements Coach {

    @Override
    public String getLatihan() {
        return "Keliling Lapangan 100x";
    }

    @Override
    public String getLayananMotivasi() {
        return "Tidak memiliki layanan motivasi";
    }

}
