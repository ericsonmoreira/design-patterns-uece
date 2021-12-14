package com.uece.questions.abstractFactory;

/**
 * Giovanni é um pizzaiolo que trabalha nas segundas, quartas e sextas e só sabe fazer pizza de Calabresa.
 */
public class Giovanni extends PizzaFactory {

    @Override
    public Pizza getPizza() {
        return new PizzaCalabresa();
    }
}
