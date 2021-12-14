package com.uece.questions.abstractFactory;

import java.util.ArrayList;

public class PizzaPresunto extends Pizza {
    public PizzaPresunto() {
        this.sabor = "Presunto";
        this.ingredientes = new ArrayList<String>();
        ingredientes.add("queijo");
        ingredientes.add("presunto");
        ingredientes.add("tomate");
    }
}
