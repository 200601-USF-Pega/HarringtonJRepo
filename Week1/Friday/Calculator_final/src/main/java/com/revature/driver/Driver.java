package com.revature.driver;

import com.revature.menus.IMenu;
import com.revature.menus.MainMenu;

public class Driver {

    public static void main(String[] args) {

        IMenu currentMenu = new MainMenu();

        currentMenu.menuStart();


    }

}
