package com.uece.questions.builder;

public class FuncionarioMontador {
    public PedidoBuilder pedidoBuilder;

    public FuncionarioMontador(PedidoBuilder pedidoBuilder) {
        this.pedidoBuilder = pedidoBuilder;
    }

    public void contruirPedido(String sanduiche, String batata, String brinquedo, String refrigerante) {
        this.pedidoBuilder.buildSanduiche(sanduiche);
        this.pedidoBuilder.buildBatata(batata);
        this.pedidoBuilder.buildBrinquedo(brinquedo);
        this.pedidoBuilder.buildRefrigerante(refrigerante);
    }

    public Pedido getPedido() {
        return this.pedidoBuilder.pedido;
    }
}
