package com.epam.trainings.di.guice;

import ratpack.handling.Context;
import ratpack.handling.Handler;

class LoggingHandler implements Handler {

    @Override
    public void handle(Context context) {
        System.out.println("Received: " + context.getRequest().getUri());
        context.next();
    }
}
