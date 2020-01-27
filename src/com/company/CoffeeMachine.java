package com.company;

import com.company.drink.Coffee;
import com.company.drink.Drink;
import com.company.drink.Tea;

public class CoffeeMachine {
    //region Public Methods

    public Drink makeDrink(Comand comand){
        if (comand.getDrinkName().equals("C")){
            return new Coffee(comand.getSugarQuantity());
        } else if (comand.getDrinkName().equals("T")){
            return new Tea(comand.getSugarQuantity());
        } else {
            throw new RuntimeException("Reload page");
        }
    }

    //endregion
}
