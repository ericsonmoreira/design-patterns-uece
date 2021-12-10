package com.uece.questions.decorator;

public class YogurtCaldaMorango extends YogurtDecorator {
    private double custo;

    private String produtos;

    public YogurtCaldaMorango(Yogurt yogurtDecorator) {
        super(yogurtDecorator);
        this.custo = 1.00;
        this.produtos = "Cobertura - Calda de Morango";
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public String getProdutos() {
        return super.getProdutos() + ", "+ produtos;
    }
}
