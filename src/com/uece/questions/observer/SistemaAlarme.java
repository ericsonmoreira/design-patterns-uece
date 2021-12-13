package com.uece.questions.observer;

import java.util.ArrayList;

public class SistemaAlarme implements Observer, Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void update() {
        System.out.println("Sistema de Alarme acionado");
        this.notifyObservers();
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
}
