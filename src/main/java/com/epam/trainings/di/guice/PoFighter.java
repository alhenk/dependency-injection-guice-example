package com.epam.trainings.di.guice;

import com.google.inject.Inject;

public class PoFighter implements Fighter {
    private final static String NAME ="Po";
    private final Weapon weapon;
    private final FightingStyle fightingStyle;

    @Inject
    public PoFighter(@Chopsticks Weapon weapon, @Dragon FightingStyle fightingStyle) {
        this.weapon = weapon;
        this.fightingStyle = fightingStyle;
    }

    @Override
    public String giveUsYourName() {
        return NAME;
    }

    @Override
    public String fight() {
        return fightingStyle.getDetails() + " " + weapon.getAttackDamage();
    }
}
