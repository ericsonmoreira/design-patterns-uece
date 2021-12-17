package com.uece.questions.iterator;

public class Card implements Comparable<Card>{
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Card card) {
        if (this.value > card.value) {
            return 1;
        } else if (this.value < card.value) {
            return -1;
        } else {
            return 0;
        }
    }
}
