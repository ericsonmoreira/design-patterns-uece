package com.uece.questions.decorator;

public class YogurtFrutasCristalizadas extends YogurtDecorator {
    private double custo;

    private String produtos;

    public YogurtFrutasCristalizadas(Yogurt yogurtDecorator) {
        super(yogurtDecorator);
        this.custo = 2.00;
        this.produtos = "Topo - Frutas Cristalizadas";
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
