package zad_dodatkowe03;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Max item is: %s\n",max(new int[] {1,2,3}));
        System.out.printf("Max item is: %s\n",max(new int[] {-1,-2,-3}));
        System.out.printf("Max item is: %s\n",max(new int[] {0}));
        System.out.printf("Max item is: %s\n",max(new int[] {1}));
        System.out.printf("Max item is: %s\n",max(new int[] {-11}));
        System.out.printf("Max item is: %s\n",max(new int[] {}));
        System.out.println();


        //generate list with random integers
        int numberOfItems = 10;
        int[] randomItems = randomItems(numberOfItems);
        System.out.print("Max item of:");
        print(randomItems);
        System.out.println("is: " + max(randomItems));
    }

    private static int[] randomItems(int numberOfItems) {

        int[] items = new int[numberOfItems];
        Random randomno = new Random();
        for (int i = 0; i < items.length; i++) {
            items[i] = randomno.nextInt(99);
        }
        return items;
    }

    private static int max(int[] items) {
        if (items.length == 0){
            return 0;
        }

        int maxItem = items[0];
        for (int item : items) {
            if (item > maxItem){
                maxItem = item;
            }
        }
        return maxItem;
    }

    private static void print(int[] items) {
        for (int item : items) {
            System.out.print(" " + item);
        }
        System.out.println();
    }
}
