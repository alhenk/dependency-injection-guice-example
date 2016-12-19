package com.epam.trainings.di.guice;


public class ClutchesWeapon implements Weapon{

    public ClutchesWeapon() {
    }

    @Override
    public String getAttackDamage() {
        return "I've got deadly Clutches: 2 punches - 10 holes";
    }
}
