package com.uece.questions.chainOfResponsability;

public class CoinFive extends CoinMachineChain{
    public CoinFive() {
        super(CoinID.FIVE);
    }

    @Override
    protected void handleCoin() {
        this.numCoins++;
        System.out.println("Add 0,05");
    }

    @Override
    protected double getCoinsValue() {
        return this.numCoins * 0.05;
    }
}
