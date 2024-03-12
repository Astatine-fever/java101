package Chapters.C21_Java_Collections;

import java.util.*;

class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store mappings of names to ages
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        // Add mappings to the TreeMap
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        // Print the contents of the TreeMap
        System.out.println("TreeMap contents: " + ageMap);

        // Get the age of a specific person
        int bobAge = ageMap.get("Bob");
        System.out.println("Bob's age: " + bobAge);

        // Check if a key exists in the TreeMap
        boolean containsAlice = ageMap.containsKey("Alice");
        System.out.println("Does TreeMap contain 'Alice'? " + containsAlice);

        // Check if a value exists in the TreeMap
        boolean containsAge30 = ageMap.containsValue(30);
        System.out.println("Does TreeMap contain age 30? " + containsAge30);

        // Remove a mapping from the TreeMap
        Integer removedAge = ageMap.remove("Charlie");
        System.out.println("Removed age of Charlie: " + removedAge);

        // Print the updated contents of the TreeMap
        System.out.println("Updated TreeMap contents: " + ageMap);

        // Iterate over the entries (key-value pairs) of the TreeMap
        System.out.println("Iterating over TreeMap entries:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the size of the TreeMap
        int size = ageMap.size();
        System.out.println("Size of TreeMap: " + size);

        // Check if the TreeMap is empty
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("Is TreeMap empty? " + isEmpty);

        // Get the first (lowest) key in the TreeMap
        String firstKey = ageMap.firstKey();
        System.out.println("First key in TreeMap: " + firstKey);

        // Get the last (highest) key in the TreeMap
        String lastKey = ageMap.lastKey();
        System.out.println("Last key in TreeMap: " + lastKey);

        // Get the least key strictly greater than "Alice"
        String higherKey = ageMap.higherKey("Alice");
        System.out.println("Key higher than 'Alice': " + higherKey);

        // Get the greatest key strictly less than "Bob"
        String lowerKey = ageMap.lowerKey("Bob");
        System.out.println("Key lower than 'Bob': " + lowerKey);

        // Get the least key greater than or equal to "Bob"
        String ceilingKey = ageMap.ceilingKey("Bob");
        System.out.println("Ceiling key for 'Bob': " + ceilingKey);

        // Get the greatest key less than or equal to "Bob"
        String floorKey = ageMap.floorKey("Bob");
        System.out.println("Floor key for 'Bob': " + floorKey);
    }
}
