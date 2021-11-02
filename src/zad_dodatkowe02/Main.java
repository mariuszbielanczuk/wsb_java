package zad_dodatkowe02;

public class Main {

    public static void main(String[] args) {

        String[] items1 = {"element1", "element2", "element3"};
        String[] items2 = {"element1", "element2"};
        String[] items3 = {"element1"};
        String[] items4 = {};

        print(items1);
        print(reverse(items1));
    }


    public static String[] reverse(String[] items) {
        String[] reverseItems = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            int j = items.length - i - 1;
            reverseItems[j] = items[i];
        }
        return reverseItems;
    }

    private static void print(String[] items) {
        System.out.print("Table:");
        for (String item : items) {
            System.out.print(" " + item);
        }
        System.out.println();
    }
}
