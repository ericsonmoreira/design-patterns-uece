package com.uece.questions.chainOfResponsability;

public class CoinTen extends CoinMachineChain{
    public CoinTen() {
        super(CoinID.TEN);
    }

    @Override
    protected void handleCoin() {
        this.numCoins++;
        System.out.println("Add 0,10");
    }

    @Override
    protected double getCoinsValue() {
        return this.numCoins * 0.1;
    }
}
