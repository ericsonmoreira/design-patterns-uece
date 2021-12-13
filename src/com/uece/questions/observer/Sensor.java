package com.uece.questions.observer;

import java.util.ArrayList;

public class Sensor implements Subject {
    private String name;

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public Sensor(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(obs -> obs.update());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", observers=" + observers +
                '}';
    }
}