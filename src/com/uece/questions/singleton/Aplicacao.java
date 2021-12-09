package com.uece.questions.singleton;

/**
 * 1. Singleton: Uma boa prática no desenvolvimento de aplicações é o registro de exceções,  de informações de controle
 * ou de segurança nas aplicações. Chamamos isso de Log da  aplicação. Uma aplicação não precisa ter mais do que uma
 * classe gerando e registrando as  informações do log. Nesse contexto, o padrão de projeto Singleton pode ser
 * implementado.  Portanto, aplique esse padrão nas classes apresentadas a seguir. A classe Logger usa a  variável
 * ativo para indicar se as informações podem ser exibidas, enquanto que a classe  Aplicacao é a classe que utiliza
 * dois objetos de tipo Logger.
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
