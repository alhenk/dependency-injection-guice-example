package com.epam.trainings.di.guice;



public class DragonStyle implements FightingStyle{

    public DragonStyle() {
    }

    @Override
    public String getDetails() {
        return "I've mastered Dragon style";
    }
}
