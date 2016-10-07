package com.epam.trainings.di.guice;


import com.google.common.collect.Lists;

import java.util.List;

class FightersServiceImpl implements FightersService {

    @Override
    public List<String> getFightersNames() {
        return Lists.newArrayList("Po", "Tigress", "Master Shifu", "Oogway", "Monkey", "Mantis", "Crane");
    }
}
