package com.uece.questions.iterator;

import java.util.Random;
import java.util.Stack;

public class JogadorStack implements CardsAgregador {
    protected Stack<Card> cards;

    protected String nome;

    public JogadorStack(String nome) {
        this.nome = nome;
        this.cards = new Stack<Card>();
        Random random = new Random();
        for (int i = 0; i < Main.NUM_CARDS; i++) {
            // quanto menor o valor das cartas, maior a chance do jogo nunca acabar
            this.cards.add(new Card(random.nextInt(100) + 1));
        }
    }

    @Override
    public CardsIterator criarIterator() {
        return new StackCardsIterator(cards);
    }

    @Override
    public boolean estaVazia() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        return "JogadorStack{" +
                "nome='" + nome + '\'' +
                ", cards=" + cards +
                '}';
    }
}
