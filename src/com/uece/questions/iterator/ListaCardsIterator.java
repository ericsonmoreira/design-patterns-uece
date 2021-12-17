package com.uece.questions.iterator;

import java.util.ArrayList;

public class ListaCardsIterator implements CardsIterator {
    protected ArrayList<Card> cards;
    protected int contador;

    public ListaCardsIterator(ArrayList<Card> cards) {
        this.cards = cards;
        this.contador = 0;
    }

    @Override
    public void first() {
        this.contador = 0;
    }

    @Override
    public void next() {
        this.contador++;
    }

    @Override
    public boolean isDone() {
        return contador == cards.size();
    }

    @Override
    public Card currentItem() {
        if (isDone()) {
            contador = cards.size() -1;
        } else if (contador < 0){
            contador = 0;
        }
        return cards.get(contador);
    }
}
