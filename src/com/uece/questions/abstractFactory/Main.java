package com.uece.questions.abstractFactory;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * 11. Abstract Factory: Considere os seguintes conceitos do mundo real: pizzaria, pizzaiolo,  pizza, consumidor.
 * Considere ainda que em uma determinada pizzaria, dois pizzaiolos se  alternam. Um deles trabalha segundas, quartas e
 * sextas e só sabe fazer pizza de calabresa  (queijo + calabresa + tomate), o outro trabalha às terças, quintas e
 * sábados e só sabe fazer pizza  de presunto (queijo + presunto + tomate). A pizzaria fecha aos domingos Tente mapear
 * os conceitos acima para o padrão Abstract Factory (hierarquia de fábricas, hierarquia de  produtos, cliente) e
 * implemente um programa que receba uma data como parâmetro (formato  dd/mm/yyyy) e imprima os ingredientes da pizza
 * que é feita no dia ou, se a pizzaria estiver  fechada, informe isso na tela.
 */

public class Main {
    public static void main(String[] args) {
        testePedidoPizza("13/12/2021"); // Seg
        testePedidoPizza("14/12/2021"); // Ter
        testePedidoPizza("15/12/2021"); // Qua
        testePedidoPizza("16/12/2021"); // Qui
        testePedidoPizza("17/12/2021"); // Sex
        testePedidoPizza("18/12/2021"); // Sab
        testePedidoPizza("19/12/2021"); // Dom
    }

    /**
     * Retorna o dia da semana por uma data em {@link String} no formato dd/MM/yyyy
     * @param data
     * @return
     */;
    public static String getDayOfWeek(String data) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DayOfWeek dayOfWeek = DayOfWeek.from(parser.parse(data));
        return dayOfWeek.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR"));
    }

    public static void testePedidoPizza(String data) {
        try {
            String diaDaSemana = getDayOfWeek(data);
            PizzaFactory pizzaFactory = PizzaFactory.getInstance(diaDaSemana);
            Pizza pizza = pizzaFactory.getPizza();
            System.out.println(pizza);
        } catch (NullPointerException e) {
            System.out.println("Pizzaria fechada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
