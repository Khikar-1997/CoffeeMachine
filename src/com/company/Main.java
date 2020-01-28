package com.company;

import com.company.drink.Coffee;
import com.company.drink.Drink;
import com.company.drink.Tea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comandLine = scanner.nextLine();
        Comand comand = Converter.convertInputComand(comandLine);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        User user = new User("Vaxo",400);
        Drink coffee = new Coffee(150);
        Drink tea = new Tea(130);
        coffeeMachine.printChangeStuff(coffeeMachine.changeStuff(coffee.getCast(),user.getMoney()));
        coffeeMachine.printCoffeeMachineProduct(coffeeMachine.buyDrink(coffeeMachine.changeStuff(coffee.getCast(),user.getMoney())),coffeeMachine.makeDrink(comand));
    }
}
