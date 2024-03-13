package Chapters.C04_Collections;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, ArrayList<Object>> personDetails = new HashMap<>();

        // Create an ArrayList to store multiple values
        ArrayList<Object> prasannaDetails = new ArrayList<>();
        prasannaDetails.add(26);
        prasannaDetails.add(176.25);

        // Store the ArrayList as the value for the key "prasanna"
        personDetails.put("prasanna", prasannaDetails);

        // Retrieve values based on the key
        ArrayList<Object> retrievedDetails = personDetails.get("prasanna");
        int age = (int) retrievedDetails.get(0);
        double height = (double) retrievedDetails.get(1);

        // Display retrieved values
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
