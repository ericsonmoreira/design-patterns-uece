package com.uece.questions.factorymethod;

public class ImagemBMP implements Imagem{
    @Override
    public void carregar() {
        System.out.println("Imagem BMP:");
        System.out.println("Carregando imagem BMP...");
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem por 20 segundos");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando imagem");
    }
}
