package Chapters.C02_Control_flow_Statements;

import java.util.HashMap;
import java.util.Map;

class ForEachHashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Iterate over entries (key-value pairs) of the HashMap
        System.out.println("Iterating over entries (key-value pairs) of the HashMap:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score);
        }
    }
}
