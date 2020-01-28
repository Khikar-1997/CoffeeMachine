package com.company;

public class Converter {
    //region Public Methods

    public static Comand convertInputComand(String text) {
        Comand comand = new Comand();
        String[] textArray = text.split(":");
        String textPart1 = textArray[0];
        String textPart2 = textArray[1];
        String textPart3 = textArray[2];
        comand.setDrinkName(textPart1);
        comand.setSugarQuantity(Integer.parseInt(textPart2));
        comand.setStick(Integer.parseInt(textPart3));
        return comand;
    }

    //endregion
}
