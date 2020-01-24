package com.company;

public class Shirt {
    int tag;
    String brand;
    double price;
    char gendar;

    public Shirt(int tag, String brand, double price, char gendar) {
        this.tag = tag;
        this.brand = brand;
        this.price = price;
        this.gendar = gendar;
    }

    public int getTag() {
        return tag;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public char getGendar() {
        return gendar;
    }
}
