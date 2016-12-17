package com.epam.trainings.di.guice;

import javax.inject.Inject;

public class TigerStile implements FightingStyle {
    @Inject
    public TigerStile() {
    }

    @Override
    public String getDetails() {
        return "I've mastered the Tiger style";
    }
}
