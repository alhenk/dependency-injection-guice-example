package com.epam.trainings.di.guice;

import javax.inject.Inject;

public class ChopsticksWeapon implements Weapon{

    @Inject
    public ChopsticksWeapon() {
    }

    @Override
    public String getAttackDamage() {
        return "2 punches - 4 holes";
    }
}
