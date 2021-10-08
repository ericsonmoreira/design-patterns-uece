package com.uece.strategy;

public class MarketingPrintStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("Print MarketingPrintStrategy");
    }
}
