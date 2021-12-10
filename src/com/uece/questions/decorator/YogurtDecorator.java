package com.uece.questions.decorator;

public class YogurtDecorator implements Yogurt {

    private Yogurt yogurtDecorator;

    public YogurtDecorator(Yogurt yogurtDecorator) {
        this.yogurtDecorator = yogurtDecorator;
    }

    @Override
    public double getCusto() {
        return yogurtDecorator.getCusto();
    }

    @Override
    public String getDescricao() {
        return yogurtDecorator.getDescricao();
    }

    @Override
    public String getProdutos() {
        return yogurtDecorator.getProdutos();
    }

}
