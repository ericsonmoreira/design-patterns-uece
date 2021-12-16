package com.uece.questions.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<TextoMemento> estados;

    public CareTaker() {
        this.estados = new Stack<TextoMemento>();
    }

    public void addMemento (TextoMemento memento){
        this.estados.push(memento);
    }

    public TextoMemento getUltimoEstado () {
        if (estados.size() <= 0) {
            return new TextoMemento("");
        }
        return this.estados.pop();
    }
}
