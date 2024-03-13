package Chapters.C20_Json;


import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class e21_jsontojava {

    public static void main(String[] args) {
        // Read JSON from file
        String json = readJsonFromFile("array.json");

        // Convert JSON to array
        int[][] array = convertJsonToArray(json);

        // Print array
        printArray(array);
    }

    public static String readJsonFromFile(String filename) {
        try (FileReader fileReader = new FileReader(filename)) {
            StringBuilder stringBuilder = new StringBuilder();
            int character;
            while ((character = fileReader.read()) != -1) {
                stringBuilder.append((char) character);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int[][] convertJsonToArray(String json) {
        // Create Gson instance
        Gson gson = new Gson();

        // Convert JSON to array
        return gson.fromJson(json, int[][].class);
    }

    public static void printArray(int[][] array) {
        System.out.println("Array read from JSON file:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
