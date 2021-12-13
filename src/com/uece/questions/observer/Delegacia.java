package com.uece.questions.observer;

public class Delegacia implements Observer {
    @Override
    public void update() {
        System.out.println("Delegacia acionada");
    }
}
