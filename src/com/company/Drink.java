package com.company;

public class Drink implements MenuItem{
    private double price;
    private String name;

    public Drink(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //Returns the price of a drink
    public double getPrice()
    {
        return price;
    }

    //Returns the name of a drink
    public String getName()
    {
        return name;
    }
}
