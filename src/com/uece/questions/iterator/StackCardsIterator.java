package com.uece.questions.iterator;

import java.util.ArrayList;
import java.util.Stack;

public class StackCardsIterator implements CardsIterator {
    protected Stack<Card> cards;
    protected int contador;

    public StackCardsIterator(Stack<Card> cards) {
        this.cards = cards;
        this.contador = cards.size() - 1;
    }

    @Override
    public void first() {
        this.contador = cards.size() - 1;
    }

    @Override
    public void next() {
        this.contador--;
    }

    @Override
    public boolean isDone() {
        return contador == -1;
    }

    @Override
    public Card currentItem() {
        if (isDone()) {
            contador = 0;
        } else if (contador > cards.size() - 1){
            contador = cards.size() - 1;
        }
        return cards.get(contador);
    }
}
