package com.uece.questions.decorator;

public class FrozenYogurt implements Yogurt {
    private double custo = 10.00;

    private String produto = "FrozenYogurt";

    private String descricao = "O mais saboroso FrozenYogurt que você já provou";

    @Override
    public double getCusto() {
        return this.custo;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String getProdutos() {
        return this.produto;
    }
}
