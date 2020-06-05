package com.revature.menus;

import java.util.Scanner;

public class MainMenu implements IMenu {


    @Override
    public void menuStart() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my Calculator Program!");
        System.out.println("Press [1] to start Calculating!");
        System.out.println("Press [0] to Exit");

        MenuFactory menuFactory = new MenuFactory();
        IMenu currentMenu;
        while(true){
        int myChoice = sc.nextInt();
        switch (myChoice) {

            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;

            case 1:
                currentMenu = menuFactory.changeMenu("Calculator");
                currentMenu.menuStart();
                break;

            default:
                System.out.println("Press the required numbers!");
                continue;

        }
        }


    }
}
