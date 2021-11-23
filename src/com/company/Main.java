package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Kitchen kitchen1 = new Kitchen();
        System.out.println(kitchen1.calculateRating());

        GasOven gasOvenBosch = new GasOven(9, 4, 5);
        Table woodenTable = new Table(10, "Videnov", 10, 4, true, TableShapes.ELLIPSE);
        Chair whiteChair = new Chair();
        ArrayList<Chair> chairs = new ArrayList<>();
        chairs.add(whiteChair);
        chairs.add(whiteChair);
        chairs.add(whiteChair);
        chairs.add(whiteChair);
        Kitchen customKitchen = new Kitchen(gasOvenBosch, woodenTable, chairs);
        System.out.println(customKitchen);
        System.out.println(customKitchen.calculateRating());
    }
}
