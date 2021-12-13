package com.uece.questions.observer;

public class CompaniaSeguros implements Observer {
    @Override
    public void update() {
        System.out.println("Compania de Seguros acionada");
    }
}
