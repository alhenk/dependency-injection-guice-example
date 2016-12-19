package com.epam.trainings.di.guice;


public class TigerStile implements FightingStyle {

    public TigerStile() {
    }

    @Override
    public String getDetails() {
        return "I've mastered the Tiger style";
    }
}
