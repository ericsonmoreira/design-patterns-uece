package com.uece.questions.abstractFactory;

import java.util.ArrayList;

public class PizzaCalabresa extends Pizza {
    public PizzaCalabresa() {
        this.sabor = "Calabresa";
        this.ingredientes = new ArrayList<String>();
        ingredientes.add("queijo");
        ingredientes.add("calabresa");
        ingredientes.add("tomate");
    }
}
