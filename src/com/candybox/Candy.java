package com.candybox;

public class Candy extends candyBox {
    private String chocolate;

    public Candy(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        type = "Candy";
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
}


