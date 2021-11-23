package com.company;

public class GasOven extends Oven{
    public GasOven(int rating, int stovesCount, int yearsOfWarranty)
    {
        super.rating = rating;
        super.stovesCount = stovesCount;
        super.yearsOfWarranty = yearsOfWarranty;
    }

    @Override
    public void cookOnStove() {

    }
}
