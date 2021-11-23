package com.company;

public class Chair extends Equipment implements Seatable{
    String model;
    double weight;

    public Chair()
    {
        super.rating = 6;
        this.model = "soft";
        this.weight = 3.4;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearManufactured=" + yearManufactured +
                ", rating=" + rating +
                '}';
    }
}
