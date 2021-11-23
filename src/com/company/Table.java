package com.company;

public class Table extends Equipment implements Deskable{
    int seats;
    boolean isExtendable;
    TableShapes tableShape;

    public Table()
    {
        this.rating = 5;
    }

    @Override
    public String toString() {
        return "Table{" +
                "seats=" + seats +
                ", isExtendable=" + isExtendable +
                ", tableShape=" + tableShape +
                '}';
    }

    public Table(int rating, String manufacturer, int yearManufactured, int seats, boolean isExtendable, TableShapes tableShape)
    {
        super.manufacturer = manufacturer;
        super.yearManufactured = yearManufactured;
        super.rating = rating;
        this.seats = seats;
        this.isExtendable = isExtendable;
        this.tableShape = tableShape;
    }
}
