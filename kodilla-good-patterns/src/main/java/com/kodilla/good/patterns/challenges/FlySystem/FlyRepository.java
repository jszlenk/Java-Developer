package com.kodilla.good.patterns.challenges.FlySystem;

import java.util.ArrayList;
import java.util.List;

public class FlyRepository {
    private List<Fly> fly = new ArrayList<>();

    FlyRepository() {
        fly.add(new Fly("Gdańsk", "Warszawa"));
        fly.add(new Fly("Gdańsk", "Kraków"));
        fly.add(new Fly("Gdańsk", "Wrocław"));
        fly.add(new Fly("Kraków", "Warszawa"));
        fly.add(new Fly("Kraków", "Poznań"));
        fly.add(new Fly("Warszawa", "Poznań"));
        fly.add(new Fly("Bydgoszcz", "Poznań"));
        fly.add(new Fly("Poznań", "Warszawa"));
        fly.add(new Fly("Poznań", "Wrocław"));
        fly.add(new Fly("Szczecin", "Wrocław"));
        fly.add(new Fly("Szczecin", "Gdańsk"));
    }

    public List<Fly> getFlyList() {
        return new ArrayList<>(fly);
    }
}
