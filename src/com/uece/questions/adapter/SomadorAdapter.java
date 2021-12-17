package com.uece.questions.adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class SomadorAdapter implements SomadorEsperado {

    private SomadorExistente somadorExistente;

    public SomadorAdapter(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        ArrayList<Integer> aux = new ArrayList<Integer>();

        // Adaptação
        Arrays.stream(vetor).forEach(item -> aux.add(item));

        return somadorExistente.somaLista(aux);
    }
}
