package com.company;

public abstract class Oven extends Equipment implements Cookable{
    int stovesCount;
    int yearsOfWarranty;

    @Override
    public String toString() {
        return "Oven{" +
                "stovesCount=" + stovesCount +
                ", yearsOfWarranty=" + yearsOfWarranty +
                '}';
    }

    public abstract void cookOnStove();
}
