package takeout.utils;
import static takeout.utils.PrintUtils.CommonPrintMethods.*;
import static takeout.utils.PrintUtils.PrintTitles.*;
import static takeout.utils.PrintUtils.PrintSpaces.*;
public class PrintUtils {

    private final static String LINE_LONG =  "________________________________________________________________";
    private final static String MAIN_DISHES_TITLE = "Our Best Main Dishes:";

    public static class CommonPrintMethods{
        //Print text
        public final static void print(String test){
            System.out.print(test);
        }

        // Print back
        public final static void printLn(){
            System.out.println();
    }
        public static void printLine() {
            printLn();
            print(LINE_LONG);
            printLn();
        }

    }

    public static class PrintSpaces{

            private static int maxLength = 0;

            private static int maxLengthName (String[] names){
                for (int i = 0; i < names.length; i++) {
                    if (names[i].length() > maxLength) {
                        maxLength = names[i].length();
                    }
                }
                return maxLength;
            }

            public static int spacesAfterName(String[] names, String[] names1, String[] names2, String name) {
                maxLength = maxLengthName(names);
                int maxLength1 = maxLengthName(names1);
                int maxLength2 = maxLengthName(names2);

                if (maxLength < maxLength1) {
                    maxLength = maxLength1;
                } else if (maxLength < maxLength2) {
                    maxLength = maxLength2;
                }    int count = maxLength - name.length();
                return count;
            }

            public static void printSpacesAfterName(int spacesCount) {
                for (int i = 0; i <= spacesCount; i ++) {
                    print(" ");
                }
            }

    }

    public static class PrintTitles {
        //print title menu
        public static void printMenuTitle() {
            printLn();
            printLn();
            print("_______________________Take Out Menu______________________________________");
            printLn();
            printLn();
        }

        //print title main dishes
        public static void printMainDishesTitle() {
            print(MAIN_DISHES_TITLE);
            printLn();
            printLn();
        }

        //print title sides
        public static void printSidesTitle() {
            print("Our Healthy Sides:");
            printLn();
            printLn();
        }

        //print title drinks
        public static void printDrinkTitle() {
            print("Drinks:");
            printLn();
            printLn();
        }

        public static void printPrice(double price) {
            if (price < 10) {
                print("$ " + price);
            } else {
                print("$" + price);
            }
        }
    }

    }

