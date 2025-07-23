package Generics;

import java.util.*;

class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}


class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void add(T item) { items.add(item); }
    List<T> getAll() { return items; }
}


class Display {
    static void show(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items)
            System.out.println(item);
    }
}


public class WareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.add(new Electronics("TV"));
        electronics.add(new Electronics("Laptop"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.add(new Groceries("Rice"));
        groceries.add(new Groceries("Milk"));

        System.out.println("Electronics:");
        Display.show(electronics.getAll());

        System.out.println("\nGroceries:");
        Display.show(groceries.getAll());
    }
}