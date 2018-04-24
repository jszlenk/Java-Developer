package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueOfTopics implements Observable {
    private final List<Observer> observers;
    private final List<String> questions;
    private final String name;

    public QueueOfTopics(String name) {
        observers = new ArrayList<>();
        questions = new ArrayList<>();
        this.name = name;
    }

    public void addQuestion(String question) {
        questions.add(question);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getQuestions() {
        return questions;
    }

    public String getName() {
        return name;
    }
}


