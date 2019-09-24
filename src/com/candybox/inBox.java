package com.candybox;

public class inBox implements cBox {

    private candyBox[] gift;

    public void createAndSetSize(int num) {
        this.gift = new candyBox[num];
    }

    @Override
    public candyBox[] add(candyBox sweet, int index) {
            if (index>gift.length-1) {
                candyBox[] sweets = new candyBox[gift.length+1];
                for (int i = 0; i <gift.length ; i++) {
                    if (gift[i]!=null) {
                        sweets[i] = gift[i];
                    }
                }
                sweets[gift.length+1] = sweet;
                return sweets;
            }
            this.gift[index] = sweet;
            return gift;
    }

    @Override
    public candyBox[] remove(int index) {
        this.gift[index] = null;
        candyBox[] sweets = new candyBox[gift.length-1];
        for (int i = 0; i <gift.length ; i++) {
            if (gift[i]!=null) {
                sweets[i] = gift[i];
            }
        }
        return sweets;
    }

    @Override
    public candyBox[] removeLast() {
        return this.remove(gift.length-1);
    }

    @Override
    public double printWeight() {
        double sum = 0;
        for (candyBox sweet: this.gift) {
            if (sweet != null) {
                sum+=sweet.getWeight();
            }
        }
        System.out.println(sum);
        return sum;
    }

    @Override
    public double printPrice() {
        double sum = 0;
        for (candyBox sweet: this.gift) {
            if (sweet != null) {
                sum+=sweet.getPrice();
            }
        }
        System.out.println(sum);
        return sum;
    }

    @Override
    public String toString() {
        String s = "";
        for (candyBox sweet: gift) {
            if (sweet!=null) {
                s+="Name: "+sweet.getType()+", weight: "+sweet.getWeight()+", price: "+sweet.getPrice()+", ";
                if (sweet instanceof Candy) {
                    s+= "flavour: "+((Candy) sweet).getChocolate()+"\n";
                } else if (sweet instanceof Jelly) {
                    s+= "colour: "+((Jelly) sweet).getFlavor()+"\n";
                } else if (sweet instanceof Souffle) {
                    s += "white: " + ((Souffle) sweet).getWhite()+ "\n";
                }
            }
        }
        return "CandyBox contain: "+ gift == null ? null : "\n"+s;
    }

    @Override
    public void printAll() {
        System.out.println(this.toString());

    }
}