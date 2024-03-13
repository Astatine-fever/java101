package Chapters.C04_Collections;

import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the contents of the ArrayList
        System.out.println("ArrayList contents: " + numbers);

        // Access elements by index
        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        // Update an element
        numbers.set(1, 25);
        System.out.println("Updated ArrayList contents: " + numbers);

        // Remove an element by value
        numbers.remove(Integer.valueOf(30));
        System.out.println("ArrayList after removing 30: " + numbers);

        // Check if the ArrayList contains a specific value
        boolean contains20 = numbers.contains(20);
        System.out.println("Does ArrayList contain 20? " + contains20);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Clear the ArrayList
        numbers.clear();
        System.out.println("ArrayList cleared. Is it empty now? " + numbers.isEmpty());
    }
}
