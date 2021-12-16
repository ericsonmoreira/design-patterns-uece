package com.uece.questions.builder;

public abstract class PedidoBuilder {
    protected Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    public abstract void buildSanduiche(String sanduiche);

    public abstract void buildBatata(String batata);

    public abstract void buildBrinquedo(String brinquedo);

    public abstract void buildRefrigerante(String refrigerante);
}
