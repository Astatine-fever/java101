package Chapters.C04_Collections;

import java.util.HashSet;
import java.util.Set;

class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store a collection of unique elements
        Set<String> fruitSet = new HashSet<>();

        // Add elements to the HashSet
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");

        // Try adding a duplicate element
        boolean isDuplicateAdded = fruitSet.add("Apple"); // This will have no effect
        System.out.println("Is duplicate added? " + isDuplicateAdded);

        // Print the contents of the HashSet
        System.out.println("HashSet contents: " + fruitSet);

        // Check if an element exists in the HashSet
        boolean containsBanana = fruitSet.contains("Banana");
        System.out.println("Does HashSet contain 'Banana'? " + containsBanana);

        // Remove an element from the HashSet
        boolean isRemoved = fruitSet.remove("Orange");
        System.out.println("Is 'Orange' removed? " + isRemoved);

        // Print the updated contents of the HashSet
        System.out.println("Updated HashSet contents: " + fruitSet);

        // Iterate over the elements of the HashSet
        System.out.println("Iterating over HashSet elements:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }

        // Get the size of the HashSet
        int size = fruitSet.size();
        System.out.println("Size of HashSet: " + size);

        // Clear the HashSet
        fruitSet.clear();
        System.out.println("HashSet cleared. Is it empty now? " + fruitSet.isEmpty());
    }
}
