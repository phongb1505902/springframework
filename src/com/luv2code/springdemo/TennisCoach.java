package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    /* Field Injection*/
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    // define setter method
    public TennisCoach() {
        System.out.println(">> TennisCoach: constructor default");
    }
    /* End FI*/
    /*------Setter DI with annotation------*/
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: setter fortuneService");
        this.fortuneService = fortuneService;
    }*/
    /*--------------End------------*/


    /*Constructor DI with annotation*/
    /*@Autowired
    //if much implements -> @Qualifier -> public TennisCoach(@Qualifier("")FortuneService fortuneService)
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/
    /*------------ End ------------*/
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
