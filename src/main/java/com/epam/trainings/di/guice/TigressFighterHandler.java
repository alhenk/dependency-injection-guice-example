package com.epam.trainings.di.guice;

import ratpack.handling.Context;
import ratpack.handling.Handler;

import javax.inject.Inject;

public class TigressFighterHandler implements Handler {
    private Fighter tigressFighter;

    @Inject
    public TigressFighterHandler(Fighter tigressFighter) {
        this.tigressFighter = tigressFighter;
    }

    @Override
    public void handle(Context context) throws Exception {

    }
}
