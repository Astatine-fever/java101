package Chapters.C21_Java_Collections;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store mappings of names to ages
        Map<String, Integer> ageMap = new HashMap<>();

        // Add mappings to the HashMap
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        // Print the contents of the HashMap
        System.out.println("HashMap contents: " + ageMap);

        // Get the age of a specific person
        int bobAge = ageMap.get("Bob");
        System.out.println("Bob's age: " + bobAge);

        // Check if a key exists in the HashMap
        boolean containsAlice = ageMap.containsKey("Alice");
        System.out.println("Does HashMap contain 'Alice'? " + containsAlice);

        // Check if a value exists in the HashMap
        boolean containsAge30 = ageMap.containsValue(30);
        System.out.println("Does HashMap contain age 30? " + containsAge30);

        // Remove a mapping from the HashMap
        Integer removedAge = ageMap.remove("Charlie");
        System.out.println("Removed age of Charlie: " + removedAge);

        // Print the updated contents of the HashMap
        System.out.println("Updated HashMap contents: " + ageMap);

        // Iterate over the entries (key-value pairs) of the HashMap
        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the size of the HashMap
        int size = ageMap.size();
        System.out.println("Size of HashMap: " + size);

        // Clear the HashMap
        ageMap.clear();
        System.out.println("HashMap cleared. Is it empty now? " + ageMap.isEmpty());
    }
}
