import java.util.*;

class Switchcse {
    public static void main(String[] args) {
        int a, b, c;
        String choice;

            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Value");
            a = sc.nextInt();
            System.out.println("Enter B Value");
            b = sc.nextInt();
            System.out.println("Enter Arithmatic operation to be performed ");
            choice = sc.next();
        switch (choice) 
        {
            case "+": 
            {
                c = a + b;
                System.out.println("c=" + c);
                break;
            }
            case "-": 
            {
                c = a - b;
                System.out.println("c=" + c);
                break;
            }
            case "*": 
            {
                c = a * b;
                System.out.println("c=" + c);
                break;
            }
            case "/": 
            {
                c = a / b;
                int d = a % b;
                System.out.println("The Quotient is " + c);
                System.out.println("The Reminder is " + d);
                break;
            }
            default: 
            {
                System.out.println("Incorrect Choice");
            }
        }
    }

}