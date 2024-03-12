package Chapters.C20_Regular_Expressions;
import java.util.regex.*;

class RegexExample1 {
    public static void main(String[] args) {
        String input = "The cat sat on the mat.";
        String pattern = "cat";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("Found match at index " + m.start()+" to "+m.end());
        }
    }
}
