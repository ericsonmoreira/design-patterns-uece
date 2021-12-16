package com.uece.questions.mediator;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {

    private ArrayList<Colaborador> colaboradores;

    public MensagemMediator() {
        this.colaboradores = new ArrayList<Colaborador>();
    }

    public void addColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    @Override
    public void enviar(String mensagem, Colaborador colaborador) {

    }
}
