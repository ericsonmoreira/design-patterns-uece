package com.uece.questions.mediator;

public class Professor extends Colaborador {

    public Professor(String nome, Mediator mediator) {
        super(nome, mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(this + " recebeu a mensagem: " + mensagem);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
