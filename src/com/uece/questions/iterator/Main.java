package com.uece.questions.iterator;

/**
 * 16. Iterator: Em um jogo de cartas online, dois participantes possuem, inicialmente, uma  coleção de 20 cartas
 * consigo (podem ser repetidas). A cada rodada, os jogadores mostram  suas cartas atuais. Quem tiver a carta menor,
 * ganha a carta do seu adversário e a adiciona,  juntamente com sua carta, ao final da sua lista de cartas. Caso as
 * cartas sejam iguais, essas  cartas vão para o fim da lista de cartas dos seus respectivos jogadores. Ganha o jogo
 * quem  finalizar primeiro sua lista. Para jogar este jogo, cada jogador deve implementar um Iterator de  cartas,
 * contendo os métodos próximo (pega a primeira da lista), remover (remove a carta em  questão), e colocar no final
 * (coloca uma ou mais cartas no fim da fila), e estaVazia (verifica se a  lsita está vazia). Os Jogadores A e B se
 * inscreveram no jogo, mas A armazenou suas cartas em  um ArrayList, enquanto B as armazenou em uma pilha. Implemente
 * esse jogo e os jogadores  usando o padrão Iterator.
 */

public class Main {
    public static int NUM_CARDS = 20;

    public static void main(String[] args) {
        JogadorList A = new JogadorList("A");
        JogadorStack B = new JogadorStack("B");

        System.out.println(A.cards);
        System.out.println(B.cards);

        CardsIterator iteratorA = A.criarIterator();
        CardsIterator iteratorB = B.criarIterator();


        while (!(A.estaVazia() || B.estaVazia())) {
            Card cardJogadorA = iteratorA.currentItem();
            Card cardJogadorB = iteratorB.currentItem();

            if (cardJogadorA.compareTo(cardJogadorB) < 0) {
                A.cards.add(cardJogadorB);
                B.cards.remove(cardJogadorB);
            } else if (cardJogadorA.compareTo(cardJogadorB) > 0) {
                B.cards.add(cardJogadorA);
                A.cards.remove(cardJogadorA);
            } else {
                A.cards.remove(cardJogadorA);
                B.cards.remove(cardJogadorB);
                A.cards.add(cardJogadorA);
                B.cards.add(cardJogadorB);
            }

            System.out.println(A);
            System.out.println(B);
        }

        if (A.cards.size() < B.cards.size()) {
            System.out.println("Jogador A Venceu");
        } else {
            System.out.println("Jogador B Venceu");
        }

    }
}
