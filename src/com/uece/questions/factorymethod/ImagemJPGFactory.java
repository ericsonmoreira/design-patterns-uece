package com.uece.questions.factorymethod;

public class ImagemJPGFactory implements ImagemFactory {
    @Override
    public Imagem makeImage() {
        return new ImagemJPG();
    }
}
