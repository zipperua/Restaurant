import static takeout.utils.PrintUtils.CommonPrintMethods.*;
import static takeout.utils.PrintUtils.PrintSpaces.*;
import static takeout.utils.PrintUtils.PrintTitles.*;

public class Menu {

   final  MainDish beef = new MainDish("Beef Wellington", 13.00);
   final  MainDish fish = new MainDish("Miso Salmon", 12.00);
   final  MainDish chicken = new MainDish("Chicken Teriaki", 7.00);
   final  MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);

    static Side rice = new Side("Brown Rice", 2.99);
    static Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
    static Side beans = new Side("Green Beans Amandine", 5.00);
    static Side potato = new Side("Creamy Mashed Potatoes", 4.00);

    static Drink water = new Drink("Perrier® carbonated mineral water", 3.50);
    static Drink wineWhite = new Drink("Oaked Chardonnay", 20.50);
    static Drink wineRed =  new Drink("Château Corton Grancey Grand Cru", 40.00);
    static Drink juiceApple = new Drink("Fresh squeezed Apple juice", 10.00);

    MainDish[] mainDishes = new MainDish[] {beef, fish, chicken, pork};
    Side[] sides = new Side[]{rice, asparagus, beans, potato};
    Drink[] drinks = new Drink[]{water, wineWhite, wineRed, juiceApple};


    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
             mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }
    public double[] getMainDishesPrices(){
        double[] mainDishesPrices = new double[mainDishes.length];
        for (int i = 0; i < mainDishesPrices.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrices;
    }
    public String[] getSidesNames() {
        String[] sidesNames = new String[sides.length];
        for (int i = 0; i < sides.length; i ++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }public double[] getSidesPrices() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sides.length; i ++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }public String[] getDrinksNames() {
        String[] drinksNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i ++) {
            drinksNames[i] = drinks[i].getDrinkName();

        }
        return drinksNames;
    }
    public double[] getDrinksPrices() {
        double[] drinksPrices = new double[drinks.length];
        for (int i = 0; i < drinks.length; i ++) {
            drinksPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinksPrices;
    }

    String[] mainDishesNames = getMainDishesNames();
    double[] mainDishesPrices = getMainDishesPrices();

    public MainDish getBeef(){
        return beef;
    }



    private void printMainDishes(){
    printMainDishesTitle();
        for (int i = 0; i < mainDishesNames.length; i++) {
            print(mainDishesNames[i]);
            printSpacesAfterName(spacesAfterName(mainDishesNames,getSidesNames(),getDrinksNames(),mainDishesNames[i]));
            printPrice(mainDishesPrices[i]);
            printLn();
        }
        printLn();
    }

    private void printSides(){
    printSidesTitle();
        for (int i = 0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printSpacesAfterName(spacesAfterName(mainDishesNames,getSidesNames(),getDrinksNames(),getSidesNames()[i]));

            printPrice(getSidesPrices()[i]);
            printLn();
        }
        printLn();
    }
    private void printDrinks(){
    printDrinkTitle();
        for (int i = 0; i < getDrinksNames().length; i++) {
            print(getDrinksNames()[i]);
            printSpacesAfterName(spacesAfterName(mainDishesNames,getSidesNames(),getDrinksNames(),getDrinksNames()[i]));

            printPrice(getDrinksPrices()[i]);
            printLn();
        }
        printLn();
    }

    public void printMenu(){
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        printLn();
        printLine();
    }
}
