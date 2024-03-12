package Chapters.C20_Regular_Expressions;
import java.util.regex.*;

class EmailValidation {
    public static void main(String[] args) {
        String[] emails = {
            "user@example.com",
            "user.name@example.com",
            "user123@example.com",
            "user@example.co.uk",
            "user@example.com.au",
            "user123@gmail.com",
            "user.email@example.com",
            "user+123@example.com",
            "user-123@example.com",
            "user_123@example.com",
            "user.123@example.com"
        };

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
