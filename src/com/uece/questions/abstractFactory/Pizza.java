package com.uece.questions.abstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String sabor;
    protected ArrayList<String> ingredientes;

    @Override
    public String toString() {
        return "Pizza{" +
                "sabor='" + sabor + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
