package com.candybox;

public class Main {

    public static void main(String[] args) throws IncorrectNumberException {
        cBox cbox = new inBox();
        ((inBox) cbox).createAndSetSize(3);
        Candy candy = new Candy (84.12,76.08);
        candy.setChocolate("Milch");
        cbox.add(candy,0);

        Jelly jelly = new Jelly (4.12,36.01);
        jelly.setFlavor("Apple");
        cbox.add(jelly,2);

        Souffle souffle = new Souffle (2.18,30.01);
        souffle.setWhite("Yes");
        cbox.add(souffle,2);

        cbox.printPrice();
        cbox.printWeight();
        cbox.printAll();

    }
}


