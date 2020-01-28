package com.company;

import com.company.drink.Coffee;
import com.company.drink.Drink;
import com.company.drink.Tea;

public class CoffeeMachine {
    //region Public Methods

    public Drink makeDrink(Comand comand) {
        if (comand.getDrinkName().equals("C")) {
            return new Coffee(comand.getSugarQuantity(), comand.getStick());
        } else if (comand.getDrinkName().equals("T")) {
            return new Tea(comand.getSugarQuantity(), comand.getStick());
        } else {
            throw new RuntimeException("Reload page");
        }
    }

    public boolean buyDrink(int changeStuff) {
        if (changeStuff >= 0) {
            return true;
        } else {
            throw new RuntimeException("You don't have that much money");
        }
    }

    public int changeStuff(int drinkCast, int userMoney){
        return userMoney - drinkCast;
    }

    public void printChangeStuff(int changeStuff){
        System.out.println("Your change " + changeStuff + ".");
    }

    public void printCoffeeMachineProduct(boolean buyDrink, Drink drink) {
        if (buyDrink) {
            System.out.println(drink);
        }
    }

    //endregion
}
