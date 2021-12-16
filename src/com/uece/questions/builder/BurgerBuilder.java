package com.uece.questions.builder;

public class BurgerBuilder extends PedidoBuilder {

    @Override
    public void buildSanduiche(String sanduiche) {
        this.pedido.adicionarDentroDaCaixa(sanduiche);
    }

    @Override
    public void buildBatata(String batata) {
        this.pedido.adicionarDentroDaCaixa(batata);
    }

    @Override
    public void buildBrinquedo(String brinquedo) {
        this.pedido.adicionarDentroDaCaixa(brinquedo);
    }

    @Override
    public void buildRefrigerante(String refrigerante) {
        this.pedido.adicionarForaDaCaixa(refrigerante);
    }
}
