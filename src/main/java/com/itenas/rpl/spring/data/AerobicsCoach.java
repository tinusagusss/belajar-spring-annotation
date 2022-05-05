package com.itenas.rpl.spring.data;

import com.itenas.rpl.spring.data.service.Unfortunate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AerobicsCoach implements Coach {

    private Unfortunate Unfortunate;

    @Autowired
    public void setUnfortunate(Unfortunate Unfortunate) {
        this.Unfortunate = Unfortunate;
    }

    @Override
    public String getLatihan() {
        return "Berlatihlah selamat 1 jam secara mandiri!";
    }

    @Override
    public String getLayananMotivasi() {
        return Unfortunate.getLayananMotivasi();
    }

}
