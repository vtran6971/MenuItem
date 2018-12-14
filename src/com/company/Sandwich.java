package com.company;

public class Sandwich implements MenuItem{
    private double price;
    private String name;

    public Sandwich(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //Returns the name of a sandwich
    public double getPrice()
    {
        return price;
    }

    //Returns the name of a sandwich
    public String getName()
    {
        return name;
    }
}
