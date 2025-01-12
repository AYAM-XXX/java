package conceitos.arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceries = new ArrayList();
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("grape");
        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("peach");

        ArrayList<String> produce = new ArrayList<String>();
        produce.add("letuce");
        produce.add("tomatos");
        produce.add("pumpkin");
        produce.add("onion");

        ArrayList<String> candy = new ArrayList<String>();
        candy.add("chocolate");
        candy.add("lolipops");
        candy.add("cake");
        candy.add("Donuts");

        groceries.add(produce);
        groceries.add(fruits);
        groceries.add(candy);

        groceries.forEach(row -> {
            row.forEach(item -> System.out.print(item + "\n"));
            System.out.println(); // Move to the next line after each row
        });

    }
}