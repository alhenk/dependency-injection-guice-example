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
        Multibinder.newSetBinder(binder(), HandlerDecorator.class).addBinding().toInstance(HandlerDecorator.prepend(new LoggingHandler()));
    }
}
