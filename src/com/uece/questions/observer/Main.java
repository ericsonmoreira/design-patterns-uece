package com.uece.questions.observer;

/**
 * 7. Observer: Monte uma estrutura multi-níveis de observadores e observáveis. Crie uma  classe que representa um
 * sistema de alarme que monitora diversos sensores. O sistema de  alarme, por sua vez, é observado por uma classe que
 * representa a delegacia de polícia e outra  que representa a companhia de seguros. Quando um sensor detecta o
 * movimento deve alertar  o sistema que, em cadeia, alerta a delegacia e a cia. seguros.
 */

public class Main {
    public static void main(String[] args) {
        Subject sensorCalor = new Sensor("Calor");
        Subject sensorMovimento = new Sensor("Movimento");
        Subject sensorPressao = new Sensor("Pressao");

        SistemaAlarme sistemaAlarme = new SistemaAlarme();

        sensorCalor.attach(sistemaAlarme);
        sensorMovimento.attach(sistemaAlarme);
        sensorPressao.attach(sistemaAlarme);

        Observer delegacia = new Delegacia();
        Observer companiaSeguros = new CompaniaSeguros();

        sistemaAlarme.attach(delegacia);
        sistemaAlarme.attach(companiaSeguros);

        sensorCalor.notifyObservers();
        sensorMovimento.notifyObservers();
        sensorPressao.notifyObservers();

    }
}
