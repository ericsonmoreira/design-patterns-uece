package com.uece.questions.composite;

import java.util.ArrayList;

public abstract class ParticipanteComponent {

    protected String name;

    public ParticipanteComponent(String name) {
        this.name = name;
    }

    protected void addParticipante(ParticipanteComponent participante) throws Exception {
        throw new Exception("Não é possível adicionar participantes em: " + this.name);
    }

    protected void removeParticipante(ParticipanteComponent participante) throws Exception {
        throw new Exception("Não é possível remover participantes em: " + this.name);
    }

    protected ParticipanteComponent getParticipante(int index) throws Exception {
        throw new Exception("Não é possível retornar participantes em: " + this.name);
    }

    protected abstract int getNumParticipantes();
}
