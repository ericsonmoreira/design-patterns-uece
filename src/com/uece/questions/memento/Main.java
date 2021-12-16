package com.uece.questions.memento;

import java.util.Scanner;

/**
 * 13. Memento: Faça um programa que simule uma calculadora simples com as operações  aritméticas básicas (soma,
 * subtração, multiplicação e divisão). Permita que o usuário faça uma  operação com vários operadores e operandos.
 * Ex: 4 + 85 – 30. Use o padrão Memento para  armazenar os estados do seu sistema, onde cada operação e operando é um
 * memento, e  permita o usuário desfazer a última inserção. Por exemplo, se o usuário quiser desfazer a  operação
 * anterior, ele verá 8 + 45 -. Ao final, mostre o valor do cálculo solicitado ou uma  mensagem de erro caso não seja
 * possível realizá-lo.
 */

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            showOptions();
            String input = scanner.next();
            boolean validation = input.matches("[0-9]|[+]|[-]|[*]|[/][c][f]");
            if (!validation) break;
            calculadora.escreverTexto(input);
            System.out.println(calculadora.getTexto());
        }

        // TODO: melhorar esse fluxo

        System.out.println(calculadora.getTexto());

        calculadora.cancelEntry();

        System.out.println(calculadora.getTexto());
    }

    public static void showOptions() {
        System.out.println(
                "Digite qualquer decimal ou alguma das opções:\n" +
                "+ ===> Somar\n" +
                "- ===> Subitrair\n" +
                "* ===> Multiplicar\n" +
                "/ ===> Dividir\n" +
                "c ===> Desfazer\n" +
                "f ===> Finalizar\n");
    }
}
