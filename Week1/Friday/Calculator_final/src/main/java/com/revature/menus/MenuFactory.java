package com.revature.menus;

public class MenuFactory{






        public IMenu changeMenu(String menuName){
            IMenu newMenu;

            switch(menuName){

                case "Calculator":
                    newMenu = new CalculatorMenu();
                    return newMenu;
                case "Main Menu":
                    newMenu = new MainMenu();
                    return newMenu;

                default:
                    System.out.println("Exiting Program you messed up!");
                    System.exit(0);



            }



        return null;
    }
}
