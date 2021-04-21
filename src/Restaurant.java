import practice.practice11.Main;

public class Restaurant {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.printMenu();

        String [] names = menu.getMainDishesNames();

        MainDish newBeef = menu.getBeef();

        Order order1 = new Order("AAA");
        order1.printOrder();

        Order order2 = new Order("BBB");
        order2.printOrder();

        Order order3 = new Order("CCC");
        order3.printOrder();

        order3.cancelOrder();
        order3.printOrder();

        Order order4 = new Order("DDD");
        order4.printOrder();

        order3.setStatusActive();
        order3.printOrder();

        order1.setStatusDone();
        order1.printOrder();

        order1.setStatusActive();
        order1.printOrder();

        order1.setStatusDone();
        order1.printOrder();


    }
}
