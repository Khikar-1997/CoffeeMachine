package com.company.drink;

import java.util.Objects;

public class Tea extends Drink {
    //region Propertys

    private int sugarQuantity;
    private int stick;

    //endregion

    //region Constructors

    public Tea(String name,int cast, int sugarQuantity, int stick) {
        super(name,cast);
        if (stick == 1 || stick == 0){
            this.stick = stick;
        } else {
            throw new RuntimeException("Choose one tea stick");
        }
        if (sugarQuantity >= 0) {
            this.sugarQuantity = sugarQuantity;
        } else {
            throw new RuntimeException("!!!!");
        }
    }

    public Tea(int sugarQuantity, int stick) {
        if (stick == 1 || stick == 0){
            this.stick = stick;
        } else {
            throw new RuntimeException("Choose one tea stick");
        }
        if (sugarQuantity >= 0) {
            this.sugarQuantity = sugarQuantity;
        } else {
            throw new RuntimeException("!!!!");
        }
        if (sugarQuantity == 0){
            this.stick = 0;
        } else {
            this.stick = stick;
        }
    }

    public Tea(int cast) {
        super(cast);
    }

    public Tea() {
    }

    //endregion

    //region Getter and Setter

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugarQuantity) {
        if (sugarQuantity >= 0) {
            this.sugarQuantity = sugarQuantity;
        } else {
            throw new RuntimeException("!!!!");
        }
    }

    public int getStick() {
        return stick;
    }

    public void setStick(int stick) {
        if (stick == 1 || stick == 0){
            this.stick = stick;
        } else {
            throw new RuntimeException("Choose one tea stick");
        }
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tea tea = (Tea) o;
        return sugarQuantity == tea.sugarQuantity &&
                stick == tea.stick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sugarQuantity, stick);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "sugarQuantity=" + sugarQuantity +
                ", stick=" + stick +
                '}';
    }

    //endregion
}
