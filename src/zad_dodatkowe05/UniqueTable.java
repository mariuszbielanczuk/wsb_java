package zad_dodatkowe05;

public class UniqueTable {

    double[] items = new double[0];

    void addItem(double newItem) {
        System.out.println("\nAdding item " + newItem);
        // check if ineItem exists
        for (double item : items) {
            if (item == newItem) {
                System.out.println("Item " + newItem + " exists.");
                return;
            }
        }

        // create list newItems[] with length of items[]+1
        double[] newItems = new double[items.length + 1];
        int index = 0;
        // read all elements of items[] into newItems[]
        for (double item : items) {
            newItems[index] = item;
            index++;
        }
        // last index of newItems is empty
        // read input parameter newItem to last index of newItems[]
        newItems[newItems.length - 1] = newItem;

        items = newItems;
        System.out.println("Item added successfully.");
    }

    void deleteItem(double deleteItem) {
        System.out.println("\nDeleting item " + deleteItem);
        // check if deleteItem exists - exit if doesn't
        boolean itemExists = false;
        for (double item : items) {
            if (item == deleteItem) {
                itemExists = true;
            }
        }
        if (itemExists == false) {
            System.out.println("Item " + deleteItem + " doesn't exist in table.");
            return;
        }

        // delete item
        int index = 0;
        double[] newItems = new double[items.length - 1];
        for (double item : items) {
            if (item != deleteItem) {
                newItems[index] = item;
                index++;
            }
        }
        items = newItems;

        System.out.println("Item " + deleteItem + " deleted.");
    }


    public String toString() {
        String string = "[";
        for (int i = 0; i < items.length; i++) {
            string += items[i];
            if (i == items.length - 1) {
                break;
            }
            string += ", ";
        }
        string += "]";
        return string;
    }
}
