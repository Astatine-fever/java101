package Chapters.Json;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class json {

    public static void main(String[] args) {
        // Sample 2-dimensional array
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Convert array to JSON
        String json = convertArrayToJson(array);
        
        // Save JSON to file
        saveJsonToFile(json, "array.json");
        
        System.out.println("JSON representation of the array saved to file 'array.json'.");
    }

    public static String convertArrayToJson(int[][] array) {
        // Create Gson instance
        Gson gson = new Gson();

        // Convert array to JSON
        return gson.toJson(array);
    }
    
    public static void saveJsonToFile(String json, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
