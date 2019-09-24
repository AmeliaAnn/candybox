package com.candybox;

public class Jelly extends candyBox {
    private String flavor;

    public Jelly(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        type = "Jelly";
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}



