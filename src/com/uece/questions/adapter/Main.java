package com.uece.questions.adapter;

/**
 * 12. Adapter: Abaixo estão os códigos fonte de um cliente, uma interface para um somador que  ele espera utilizar e
 * uma classe concreta que implementa uma soma, mas não da maneira  esperada pelo cliente. Como você pode ver abaixo,
 * o cliente espera usar uma classe que soma  inteiros em um vetor, mas a classe pronta soma inteiros em uma lista.
 * Crie um adaptador (dica: use Adapter de objeto) para resolver esta situação.
 */

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(new SomadorAdapter(new SomadorExistente()));
        cliente.executar();
    }
}
