package com.epam.trainings.di.guice;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import ratpack.handling.HandlerDecorator;

/**
 * Contains all configuration and details are needed for
 * Guice.
 */
public class KungFuPandaModule extends AbstractModule {

    protected void configure() {
        bind(FightersService.class).to(FightersServiceImpl.class);
        bind(FightersHandler.class);
        bind(Weapon.class).annotatedWith(Clutches.class).to(ClutchesWeapon.class);
        bind(Weapon.class).annotatedWith(Chopsticks.class).to(ChopsticksWeapon.class);
        bind(FightingStyle.class).annotatedWith(Tiger.class).to(TigerStile.class);
        bind(FightingStyle.class).annotatedWith(Dragon.class).to(DragonStyle.class);
        bind(Fighter.class).annotatedWith(Po.class).to(PoFighter.class);
        bind(Fighter.class).annotatedWith(Tigress.class).to(TigressFighter.class);
        bind(PoFighterHandler.class);
        bind(TigressFighterHandler.class);
        Multibinder.newSetBinder(binder(), HandlerDecorator.class).addBinding().toInstance(HandlerDecorator.prepend(new LoggingHandler()));
    }
}
