import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeExample {
    public static void main(String[] args) {
        /*
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format for 24-hour time
        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format for 12-hour time with AM/PM
        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");

        // Display current time and date in 24-hour format
        String formattedTime24 = now.format(formatter24);
        System.out.println("Current Time and Date (24 hrs): " + formattedTime24);

        // Display current time and date in 12-hour format
        String formattedTime12 = now.format(formatter12);
        System.out.println("Current Time and Date (12 hrs): " + formattedTime12);
         */

        LocalDateTime ldl = LocalDateTime.now();
        DateTimeFormatter hrs24 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String h24 = ldl.format(hrs24);
        System.out.println("Time is "+h24);
    }
}


