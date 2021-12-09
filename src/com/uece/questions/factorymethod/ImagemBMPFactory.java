package com.uece.questions.factorymethod;

public class ImagemBMPFactory implements ImagemFactory {
    @Override
    public Imagem makeImage() {
        return new ImagemBMP();
    }
}
