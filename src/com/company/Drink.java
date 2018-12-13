package com.company;

public class Drink implements MenuItem{
    private double price;
    private String name;

    public Drink(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return( this.getName() );
    }
}
