package com.uece.questions.abstractFactory;

public abstract class PizzaFactory {

    public abstract Pizza getPizza();

    public static PizzaFactory getInstance(String data) {
        switch (data) {
            case "Ter": case "Qui": case "Sáb":
                return new Francesco();
            case "Seg": case "Qua": case "Sex":
                return new Giovanni();
            default:
                return null;
        }
    }
}
