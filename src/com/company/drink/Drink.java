package com.company.drink;

import java.util.Objects;

public abstract class Drink {
    //region Propertys

    private String name;
    private int cast;

    //endregion

    //region Constructors

    public Drink(String name, int cast) {
        this.name = name;
        this.cast = cast;
    }

    public Drink(int cast) {
        this.cast = cast;
    }

    public Drink() {
    }

    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCast() {
        return cast;
    }

    public void setCast(int cast) {
        this.cast = cast;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return cast == drink.cast &&
                Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cast);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", cast=" + cast +
                '}';
    }

    //endregion
}
