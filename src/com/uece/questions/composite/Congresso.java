package com.uece.questions.composite;

import java.util.ArrayList;
import java.util.Optional;

public class Congresso extends ParticipanteComponent {

    private ArrayList<ParticipanteComponent> participantes;

    private int numMaxParticipantes;

    public Congresso(String name, int numMaxParticipantes) {
        super(name);
        this.participantes = new ArrayList<ParticipanteComponent>();
        this.numMaxParticipantes = numMaxParticipantes;
    }

    @Override
    protected void addParticipante(ParticipanteComponent participante) throws Exception {
        int numFuturoParticipantes = this.getNumParticipantes() + participante.getNumParticipantes();
        if (this.numMaxParticipantes < numFuturoParticipantes) {
            throw new Exception("Max num de participantes execedido.");
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
    public String toString() {
        return "Congresso{" +
                "name='" + name + '\'' +
                ", numMaxParticipantes=" + numMaxParticipantes +
                ", participantes=" + participantes +
                '}';
    }

    @Override
    protected int getNumParticipantes() {
        return participantes.stream().
                map(ParticipanteComponent::getNumParticipantes).
                reduce(0, (subtotal, element) -> subtotal + element);
    }
}
