package com.epam.trainings.di.guice;

import ratpack.handling.Context;
import ratpack.handling.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class FightersHandler implements Handler {

    private final FightersService fightersService;

    @Inject
    private FightersHandler(FightersService fightersService) {
        this.fightersService = fightersService;
    }

    @Override
    public void handle(Context context) {
        context.render("We have the following fighters in the game: " + fightersService.getFightersNames());
    }
}
