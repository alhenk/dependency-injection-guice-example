package com.epam.trainings.di.guice;

import ratpack.handling.Context;
import ratpack.handling.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PoFighterHandler implements Handler {

    private final Fighter fighter;

    @Inject
    PoFighterHandler(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public void handle(Context context) throws Exception {
        context.render("Fighter : "+ fighter.giveUsYourName()+" - " + fighter.fight());
    }
}
