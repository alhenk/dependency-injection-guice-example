package com.epam.trainings.di.guice;

import javax.inject.Inject;

public class TigressFighter implements Fighter {
    private final static String NAME ="Tigress";
    private final Weapon weapon;
    private final FightingStyle fightingStyle;

    @Inject
    private TigressFighter(@Clutches Weapon weapon, @Tiger FightingStyle fightingStyle) {
        this.weapon = weapon;
        this.fightingStyle = fightingStyle;
    }

    @Override
    public String giveUsYourName() {
        return NAME;
    }

    @Override
    public String fight() {
        return fightingStyle.getDetails() + " and " + weapon.getAttackDamage();
    }
}
