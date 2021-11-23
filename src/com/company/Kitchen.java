package com.company;

import java.util.ArrayList;

public class Kitchen {
    Oven oven;
    Table table;
    ArrayList<Chair> chairs;

    public Kitchen()
    {
        this.oven = new ElectricOven();
        this.table = new Table();
        chairs = new ArrayList<>();
        //chairs.add(Chair());
    }

    public Kitchen(Oven oven, Table table, ArrayList<Chair> chairs)
    {
        this.oven = oven;
        this.table = table;
        this.chairs = chairs;
    }

    public double calculateRating()
    {
        //TODO calculate with chairs
        return (this.table.rating + this.oven.rating) / 2.0;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "oven=" + oven +
                ", table=" + table +
                ", chairs=" + chairs +
                '}';
    }
}
