package com.uece.questions.mediator;

public abstract class Colaborador {
    protected Mediator mediator;

    protected String nome;

    public Colaborador(String nome, Mediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public void enviarMensagem(String mensagem) {
        this.mediator.enviar(mensagem, this);
    }

    public abstract void receberMensagem(String mensagem);

}
