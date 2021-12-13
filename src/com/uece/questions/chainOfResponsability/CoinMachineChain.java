package com.uece.questions.chainOfResponsability;

public abstract class CoinMachineChain {
    protected CoinMachineChain next;
    protected int numCoins;
    protected CoinID coinID;

    public CoinMachineChain(CoinID coinID) {
        this.next = null;
        this.numCoins = 0;
        this.coinID = coinID;
    }

    public void setNext(CoinMachineChain next) {
        if (this.next == null) {
            this.next = next;
        } else {
            this.next.setNext(next);
        }
    }

    public void handleCoin(CoinID coinID) throws Exception {
        if (this.isValidCoin(coinID)) {
            handleCoin();
        } else {
            if (this.next == null) throw new Exception("Coin Not Provider");

            next.handleCoin(coinID);
        }
    }

    public boolean isValidCoin(CoinID coinID) {
        return this.coinID == coinID;
    }

    public double getTotal() {
        if (this.next == null) {
            return getCoinsValue();
        } else {
            return getCoinsValue() + next.getCoinsValue();
        }
    }

    public double handlePurchaseProduct(double productValue) throws Exception {
        double total = getTotal();
        if (productValue <= total) {
            // TODO: colocar aqui para remover as moedas
            return total - productValue;
        } else {
            throw new Exception("Insuficiente money");
        }
    }

    protected abstract void handleCoin();

    protected abstract double getCoinsValue();
}
