package com.company.drink;

import java.util.Objects;

public class Coffee extends Drink {
    //region Propertys

    private int sugarQuantity;

    //endregion

    //region Constructors

    public Coffee(String name, int sugarQuantity) {
        super(name);
        this.sugarQuantity = sugarQuantity;
    }

    public Coffee(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public Coffee() {
    }

    //endregion

    //region Public Methods

    //endregion

    //region Getter and Setter

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
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return sugarQuantity == coffee.sugarQuantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sugarQuantity);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "sugarQuantity=" + sugarQuantity +
                '}';
    }

    //endregion
}
