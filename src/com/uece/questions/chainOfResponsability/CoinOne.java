package com.uece.questions.chainOfResponsability;

public class CoinOne extends CoinMachineChain{
    public CoinOne() {
        super(CoinID.ONE);
    }

    @Override
    protected void handleCoin() {
        this.numCoins++;
        System.out.println("Add 0,01");
    }

    @Override
    protected double getCoinsValue() {
        return this.numCoins * 0.01;
    }
}
