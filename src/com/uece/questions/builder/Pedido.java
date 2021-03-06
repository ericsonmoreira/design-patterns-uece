package com.uece.questions.builder;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<String> dentroDaCaixa = new ArrayList<String>();

    private ArrayList<String> foraDaCaixa = new ArrayList<String>();

    public void adicionarDentroDaCaixa(String item) {
        dentroDaCaixa.add(item);
    }

    public void adicionarForaDaCaixa(String item) {
        foraDaCaixa.add(item);
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Seu pedido:\n");
        buffer.append("Dentro da caixa:\n");
        for (String item : dentroDaCaixa) buffer.append("\t" + item  + "\n");
        buffer.append("Fora da caixa:\n");
        for (String item : foraDaCaixa) buffer.append("\t" + item +  "\n");
        buffer.append("\nTenha um bom dia!\n\n");
        return buffer.toString();
    }

}
