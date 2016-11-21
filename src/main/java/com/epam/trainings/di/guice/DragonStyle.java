package com.epam.trainings.di.guice;


import javax.inject.Inject;

public class DragonStyle implements FightingStyle{
    @Inject
    public DragonStyle() {
    }

    @Override
    public String getDetails() {
        return "I know Dragon style";
    }
}
