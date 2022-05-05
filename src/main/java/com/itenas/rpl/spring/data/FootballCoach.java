package com.itenas.rpl.spring.data;

import com.itenas.rpl.spring.data.service.Unfortunate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    private Unfortunate Unfortunate;

    public Unfortunate getUnfortunate() {
        return Unfortunate;
    }

    @Autowired //Gunakan anotasi ini apabila terdapat Multiple Constructor
    public FootballCoach(Unfortunate Unfortunate) {
        this.Unfortunate = Unfortunate;
    }

    public FootballCoach(Unfortunate Unfortunate, String string) {
        this.Unfortunate = Unfortunate;
    }

    @Override
    public String getLatihan() {
        return "Lari 100 Meter kurang dari 5 menit";
    }

    @Override
    public String getLayananMotivasi() {
        return Unfortunate.getLayananMotivasi();
    }

}
