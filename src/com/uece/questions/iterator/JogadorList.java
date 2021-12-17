package com.uece.questions.iterator;

import java.util.ArrayList;
import java.util.Random;

public class JogadorList implements CardsAgregador {

    protected ArrayList<Card> cards;

    protected String nome;

    public JogadorList(String nome) {
        this.nome = nome;
        this.cards = new ArrayList<Card>();
        Random random = new Random();
        for (int i = 0; i < Main.NUM_CARDS; i++) {
            this.cards.add(new Card(random.nextInt(13) + 1));
        }
    }

    @Override
    public CardsIterator criarIterator() {
        return new ListaCardsIterator(cards);
    }

    @Override
    public boolean estaVazia() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        return "JogadorList{" +
                "nome='" + nome + '\'' +
                ", cards=" + cards +
                '}';
    }
}
