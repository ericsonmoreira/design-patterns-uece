package com.uece.questions.memento;

public class Calculadora {
    private String texto;

    private CareTaker careTaker;

    public Calculadora() {
        this.texto = "";
        this.careTaker = new CareTaker();
    }

    public void escreverTexto(String novoTexto) {
        this.careTaker.addMemento(new TextoMemento(this.texto));
        this.texto += novoTexto;
    }

    /**
     * "Cancel Entry" ou em português "Cancelar Registro"
     * Lembrar do Botão AC da calculadora
     */
    public void cancelEntry() {
        this.texto = careTaker.getUltimoEstado().getEstado();
    }

    public String getTexto() {
        return texto;
    }
}
