package com.company;

import java.util.Objects;

public class Comand {
    //region Propertys

    private String drinkName;
    private int sugarQuantity;

    //endregion

    //region Constructors

    public Comand(String drinkName, int sugarQuantity) {
        this.drinkName = drinkName;
        this.sugarQuantity = sugarQuantity;
    }

    public Comand() {
    }

    //endregion

    //region Getter and Setter

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comand comand = (Comand) o;
        return sugarQuantity == comand.sugarQuantity &&
                Objects.equals(drinkName, comand.drinkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drinkName, sugarQuantity);
    }

    @Override
    public String toString() {
        return "Comand{" +
                "drinkName='" + drinkName + '\'' +
                ", sugarQuantity=" + sugarQuantity +
                '}';
    }

    //endregion
}
