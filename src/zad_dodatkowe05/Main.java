package zad_dodatkowe05;

import zad_dodatkowe04.DynamicTable;

public class Main {

    public static void main(String[] args) {
        UniqueTable table = new UniqueTable();
        table.addItem(1.0);
        System.out.printf("Table: %s%n", table.toString());
        table.addItem(2.0);
        System.out.printf("Table: %s%n", table.toString());
        table.addItem(3.0);
        System.out.printf("Table: %s%n", table.toString());
        table.addItem(2.0);
        System.out.printf("Table: %s%n", table.toString());
        table.deleteItem(3.0);
        System.out.printf("Table: %s%n", table.toString());
        table.deleteItem(3.0);
        System.out.printf("Table: %s%n", table.toString());

    }
}
