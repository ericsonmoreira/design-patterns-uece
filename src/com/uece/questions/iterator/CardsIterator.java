package com.uece.questions.iterator;

public interface CardsIterator {
    void first();

    void next();

    boolean isDone();

    Card currentItem();
}
