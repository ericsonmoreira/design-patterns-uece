package com.uece.questions.factorymethod;

public class ImagemJPG implements Imagem{
    @Override
    public void carregar() {
        System.out.println("Imagem JPG:");
        System.out.println("Carregando imagem JPG...");
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
