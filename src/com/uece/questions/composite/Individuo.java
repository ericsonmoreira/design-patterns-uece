package com.uece.questions.composite;

public class Individuo extends ParticipanteComponent {
    public Individuo(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Individuo{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected int getNumParticipantes() {
        return 1;
    }
}
