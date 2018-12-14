package com.company;

public class Salad implements MenuItem{
    private double price;
    private String name;

    public Salad(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //Returns the price of a salad
    public double getPrice()
    {
        return price;
    }

    //Returns the name of a salad
    public String getName()
    {
        return name;
    }
}
