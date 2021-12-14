package com.uece.questions.composite;

/**
 * 9. Composite: Um congresso inscreve participantes, que podem ser um indivíduo ou uma  instituição, e cada indivíduo
 * tem um assento reservado no congresso que lhe é dado no ato da  inscrição. Faça um programa que crie um congresso,
 * adicione participantes (indivíduos e  instituições) e mostre uma listagem de todos os inscritos. Se o congresso
 * estiver cheio, não é  permitido inscrever mais participantes. Use o padrão Composite.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Congresso congresso = new Congresso("CCXP", 10);

            Instituicao uece = new Instituicao("UECE");

            uece.addParticipante(new Individuo("Ericson"));
            uece.addParticipante(new Individuo("Rogerio"));
            uece.addParticipante(new Individuo("Moreira"));

            congresso.addParticipante(uece);

            congresso.addParticipante(new Individuo("Marília"));

            System.out.println(congresso);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
