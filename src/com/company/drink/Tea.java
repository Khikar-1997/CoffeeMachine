package com.company.drink;

import java.util.Objects;

public class Tea extends Drink{
    //region Propertys

    private int sugarQuantity;

    //endregion

    //region Constructors

    public Tea(String name, int sugarQuantity) {
        super(name);
        this.sugarQuantity = sugarQuantity;
    }

    public Tea(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public Tea() {
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
        Tea tea = (Tea) o;
        return sugarQuantity == tea.sugarQuantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sugarQuantity);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "sugarQuantity=" + sugarQuantity +
                '}';
    }

    //endregion
}
