package com.uece.questions.decorator;

public class YogurtCaldaChocolate extends YogurtDecorator {
    private double custo;

    private String produtos;

    public YogurtCaldaChocolate(Yogurt yogurtDecorator) {
        super(yogurtDecorator);
        this.custo = 3.00;
        this.produtos = "Cobertura - Calda de Chocolate";
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
