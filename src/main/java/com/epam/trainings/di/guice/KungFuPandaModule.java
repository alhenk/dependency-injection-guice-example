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
        bind(Weapon.class).to(new ClutchesWeapon().getClass());
        bind(FightingStyle.class).to(new TigerStile().getClass());
        bind(Fighter.class).to(TigressFighter.class);
        bind(FighterHandler.class);
        Multibinder.newSetBinder(binder(), HandlerDecorator.class).addBinding().toInstance(HandlerDecorator.prepend(new LoggingHandler()));
    }
}
