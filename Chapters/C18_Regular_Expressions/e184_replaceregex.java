package Chapters.C18_Regular_Expressions;
import java.util.regex.*;

class RegexExample2 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        String pattern = "fox";
        String replacement = "cat";
        String output = input.replaceAll(pattern, replacement);
        System.out.println("After replacement: " + output);
    }
}
