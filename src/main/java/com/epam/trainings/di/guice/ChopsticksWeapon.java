package com.epam.trainings.di.guice;


public class ChopsticksWeapon implements Weapon{

    public ChopsticksWeapon() {
    }

    @Override
    public String getAttackDamage() {
        return "I've got deadly Chopsticks: 2 punches - 4 holes";
    }
}
