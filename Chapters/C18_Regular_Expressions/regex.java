package Chapters.C18_Regular_Expressions;
import java.util.regex.*;

class RegexExample {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String pattern = "Hello,.*";
        boolean isMatch = Pattern.matches(pattern, input);
        if (isMatch) {
            System.out.println("String matches the pattern.");
        } else {
            System.out.println("String does not match the pattern.");
        }
    }
}
