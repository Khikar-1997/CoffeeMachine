package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comandLine = scanner.nextLine();
        Comand comand = Converter.convertInputComand(comandLine);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine.makeDrink(comand));
    }
}
