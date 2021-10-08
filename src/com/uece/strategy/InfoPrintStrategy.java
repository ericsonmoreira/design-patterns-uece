package com.uece.strategy;

public class InfoPrintStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("Print InfoPrintStrategy");
    }
}
