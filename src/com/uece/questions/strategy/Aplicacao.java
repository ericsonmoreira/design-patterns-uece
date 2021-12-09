package com.uece.questions.strategy;

/**
 * 2. Strategy: Considere que sua aplicação agora vai precisar especializar o comportamento de  Logger. Teremos agora
 * as classes: LoggerEventViewer – que registra os eventos no  EventViewer; LoggerFile – que registra o evento em
 * arquivo de sistema ou LoggerDatabase – que registra o evento em um banco de dados. Considere que a aplicação pode
 * escolher  qualquer uma dessas formas de registro de log. Mostre como esse problema pode ser  resolvido utilizando o
 * padrão de projeto Strategy. Utilize as classes: Logger e Aplicacao da  questão anterior.
 */

public class Aplicacao {

    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.setAtivo(true);
        log1.log("PRIMEIRA MENSAGEM DE LOG");
        Logger log2 = Logger.getInstance();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }

}
