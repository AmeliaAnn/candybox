package com.candybox;

public interface cBox {
    candyBox[] add(candyBox sweet, int index);
    candyBox[] remove(int index);
    candyBox[] removeLast();
    double printWeight();
    double printPrice();
    void printAll();
}
