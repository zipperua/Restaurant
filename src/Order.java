import static takeout.utils.PrintUtils.CommonPrintMethods.*;

public class Order {
    private String clientName;
    private int orderNumber;
    private MainDish mainDishChoice;
    private Side sideChoice;
    private Drink drinkChoice;
    private double tips;
    private double totalPrice;

    private static int operations = 0;
    private static int staticCount = 0;
    private int dynamicCount = 0;

    public Order(String clientName) {
        this.clientName = clientName;
        this.orderNumber = ++ staticCount;
        dynamicCount ++;
        operations ++;
    }

    public void printOrder() {
        operations ++;
        printLine();
        print("Order# " + orderNumber);
        print("      Client Name:  " + clientName);
        print("     Order Status " + dynamicCount);
        print("     Operation# " + operations);
        printLine();
    }

    public void cancelOrder() {
        dynamicCount--;
        operations ++;
    }

    public void setStatusActive() {
        if (dynamicCount == 0) {
            dynamicCount++;
        } else if (dynamicCount == 2){
            dynamicCount --;
        }
        operations ++;
    }
    public void setStatusDone(){
        if (dynamicCount == 1){
            dynamicCount ++;
        }
        operations ++;
    }
}
