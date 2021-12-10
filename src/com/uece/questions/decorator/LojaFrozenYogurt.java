package com.uece.questions.decorator;

/**
 * 4. Decorator: Você irá desenvolver um sistema para uma Frozen Yogurt que vende iogurtes  montados pelos próprios
 * clientes. Um yogurt contém uma base de yogurt de fruta, topos  variados (frutas cristalizadas, castanha,...) e
 * coberturas (calda de chocolate,...). O cliente  pode escolher quantos topos e quantas coberturas quiser, sendo que o
 * preço do iogurte final  aumenta para cada topo e cobertura adicionados. Utilize o padrão Decorator para modelar e
 * implementar o problema de cálculo do valor de um pedido minimizando o número de  classes.
 */

public class LojaFrozenYogurt {
    public static void main(String[] args) {
        Yogurt yogurt = new FrozenYogurt();
        System.out.println(yogurt.getCusto());
        System.out.println(yogurt.getDescricao());
        System.out.println(yogurt.getProdutos());

        yogurt = new YogurtCastanha(yogurt);
        yogurt = new YogurtCaldaChocolate(yogurt);

        System.out.println(yogurt.getCusto());
        System.out.println(yogurt.getDescricao());
        System.out.println(yogurt.getProdutos());

    }
}
