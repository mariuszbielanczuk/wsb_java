package zad_dodatkowe04;

public class DynamicTable {

    double[] items = new double[0];

    void addItem(double newItem) {
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
    }

    void deleteItem(int deleteIndex){
        if (deleteIndex>=0 && deleteIndex < items.length){
            System.out.println("Deleting index "+ deleteIndex);
            int index = 0;
            double[] newItems = new double[items.length - 1];
            for (double item : items) {
                if (index != deleteIndex){
                    newItems[index] = item;
                    index++;
                }
            }
            items = newItems;
        }else{
            System.out.println("Index "+deleteIndex+" not found in array");
        }
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
