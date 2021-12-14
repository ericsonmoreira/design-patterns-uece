package com.uece.questions.composite;

import java.util.ArrayList;
import java.util.Optional;

public class Instituicao extends ParticipanteComponent {

    private ArrayList<ParticipanteComponent> participantes;

    public Instituicao(String name) {
        super(name);
        this.participantes = new ArrayList<ParticipanteComponent>();
    }

    @Override
    protected void addParticipante(ParticipanteComponent participante) throws Exception {
        if (participante instanceof Instituicao) {
            throw new Exception("Não é possível adicionar uma Instituição dentro de outra");
        }
        this.participantes.add(participante);
    }

    @Override
    protected void removeParticipante(ParticipanteComponent participante) throws Exception {
        this.participantes.remove(participante);
    }

    /**
     * Remove um participante pelo nome.
     * Caso não exista o participante, não faz nada.
     * @param name Nome do participante
     * @throws Exception
     */
    protected void removeParticipante(String name) throws Exception {
        Optional<ParticipanteComponent> optionalParticipante =
                this.participantes.stream().filter(p -> p.name == name).findFirst();

        if (optionalParticipante.isPresent()) {
            this.removeParticipante(optionalParticipante.get());
        }
    }

    @Override
    protected int getNumParticipantes() {
        return participantes.size();
    }

    @Override
    public String toString() {
        return "Instituicao{" +
                "name='" + name + '\'' +
                ", participantes=" + participantes +
                '}';
    }
}
