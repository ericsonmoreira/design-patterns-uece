package com.uece.questions.factorymethod;

/**
 * Você foi contratado por uma empresa que desenvolve aplicações para  edição e manipulação de imagens. Seu chefe
 * apresentou para você as seguintes classes: (classes exibidas no texto do exercício). Essas classes são responsáveis
 * por carregar imagens do tipo BMP. Seu chefe mandou que  você alterasse o código de forma que a criação de novos
 * visualizadores de imagem ficasse  mais flexível. Crie as seguintes classes: VisualizadorJPG – que visualiza imagens
 * do tipo JPG e  ImagemJPG – que trata de imagens JPG. O código deve ser desenvolvido de forma que a  criação de
 * qualquer outro visualizador seja rápida e flexível. Para resolver esse problema  altere o código acima usando o
 * padrão Factory Method.
 */

public class Visualizador{

    public void Visualizar(){
        ImagemFactory imagemFactoryBMP = new ImagemBMPFactory();
        ImagemFactory imagemFactoryJPG = new ImagemJPGFactory();

        Imagem imagemBMP = imagemFactoryBMP.makeImage();
        Imagem imagemJPG = imagemFactoryJPG.makeImage();

        imagemBMP.carregar();
        imagemBMP.exibir();
        imagemBMP.fechar();

        imagemJPG.carregar();
        imagemJPG.exibir();
        imagemJPG.fechar();

    }

    public static void main(String[] args) {
        Visualizador visualizador = new Visualizador();

        visualizador.Visualizar();
    }

}
