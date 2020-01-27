package com.company.drink;

import java.util.Objects;

public abstract class Drink {
    //region Propertys

    private String name;

    //endregion

    //region Constructors

    public Drink(String name) {
        this.name = name;
    }

    public Drink() {
    }

    //endregion

    //region Public Methods

    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                '}';
    }

    //endregion
}
