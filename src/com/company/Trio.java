package com.company;

public class Trio {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;


 public Trio (Sandwich sandwic, Salad sala, Drink drin)
 {
     this.sandwich = sandwic;
     this.salad = sala;
     this.drink = drin;
 }

    public double getPrice()
    {
        double itemOne = sandwich.getPrice();
        double itemTwo = salad.getPrice();
        double itemThree = drink.getPrice();
        double discount = 0;

        if (itemOne < itemTwo && itemOne < itemThree) {
            discount = itemOne;
        }
        if (itemTwo < itemOne && itemTwo < itemThree) {
            discount = itemTwo;
        }
        if (itemThree < itemOne && itemThree < itemTwo) {
            discount = itemThree;
        }

        return itemOne+itemTwo+itemThree-discount;
    }

    public String getName()
    {
        return sandwich.getName() +"/"+ salad.getName() +"/"+ drink.getName();
    }
}
