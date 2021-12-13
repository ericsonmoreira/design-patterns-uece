package com.uece.questions.chainOfResponsability;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 5. Chain of responsability: Crie um programa que simule uma máquina de vendas (de  refrigerante, salgadinhos, etc.).
 * A máquina possui diversos “slots”, cada um capaz de receber  um tipo de moeda diferente: 1, 5, 10 centavos, etc.
 * A máquina deve receber moedas e  delegar aos slots que capturem-nas. Quando chegar ao valor do produto
 * (ex.:R $ 1,00 o  refrigerante, R$ 2,50 o chips, etc.), a máquina deve entregar o produto e informar o troco.
 */

public class Main {
    public static void main(String[] args) {
        CoinMachineChain coinMachine = new CoinOne();
        coinMachine.setNext(new CoinFive());
        coinMachine.setNext(new CoinTen());

        try {
            coinMachine.handleCoin(CoinID.ONE);
            coinMachine.handleCoin(CoinID.ONE);
            coinMachine.handleCoin(CoinID.ONE);
            coinMachine.handleCoin(CoinID.ONE);
            coinMachine.handleCoin(CoinID.FIVE);
            coinMachine.handleCoin(CoinID.FIVE);

            System.out.println(coinMachine.getTotal());

            System.out.println(coinMachine.handlePurchaseProduct(0.05));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
