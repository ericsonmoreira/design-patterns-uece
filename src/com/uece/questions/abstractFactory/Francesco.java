package com.uece.questions.abstractFactory;

/**
 * Francesco é um pizzaiolo que trabalha nas terças, quintas e sábados e só sabe fazer pizza de Presunto.
 */
public class Francesco extends PizzaFactory {

    @Override
    public Pizza getPizza() {
        return new PizzaPresunto();
    }
}
