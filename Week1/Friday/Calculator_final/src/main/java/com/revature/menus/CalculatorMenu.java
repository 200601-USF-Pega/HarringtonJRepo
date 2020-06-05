package com.revature.menus;

import com.revature.models.Calculator;
import com.revature.menus.IMenu;

import java.util.Scanner;

public class CalculatorMenu implements IMenu{

    @Override
    public void menuStart() {

        Scanner sc = new Scanner(System.in);



        MenuFactory menuFactory = new MenuFactory();
        IMenu currentMenu;
        Calculator calc = new Calculator();

        while(true){
            System.out.println("Welcome to my Calculator Program!");
            System.out.println("Press [1] to add 2 numbers");
            System.out.println("Press [0] to Exit to Menu");
            int myChoice = sc.nextInt();
            switch (myChoice) {

                case 0:
                    currentMenu = menuFactory.changeMenu("Main Menu");
                    currentMenu.menuStart();
                    break;

                case 1:
                    System.out.println("Enter the first Number");
                    int num1;
                    int num2;
                    num1 = sc.nextInt();
                    System.out.println("Enter the second Number");
                    num2 = sc.nextInt();

                    calc.calAdd(num1, num2);


                    continue;

                default:
                    System.out.println("Press the required numbers!");
                    continue;

            }
        }


    }
}
