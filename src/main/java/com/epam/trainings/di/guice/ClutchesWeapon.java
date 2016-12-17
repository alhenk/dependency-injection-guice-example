package com.epam.trainings.di.guice;

import javax.inject.Inject;

public class ClutchesWeapon implements Weapon{
    @Inject
    public ClutchesWeapon() {
    }

    @Override
    public String getAttackDamage() {
        return "I've got deadly Clutches: 2 punches - 10 holes";
    }
}
