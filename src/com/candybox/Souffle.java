package com.candybox;

public class Souffle extends candyBox {
    private String white;

    public Souffle(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        type = "souffle";
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) { this.white = white; }
}
