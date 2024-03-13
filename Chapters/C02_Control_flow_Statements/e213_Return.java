package Chapters.C02_Control_flow_Statements;

public class e213_Return {
    public static void main(String[] args) {
        System.out.println("Inside main method.");
        int result = getNumber();
        System.out.println("Result: " + result);
    }
    
    public static int getNumber() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return i; // exit the method and return value when i equals 3
            }
            System.out.println("i = " + i);
        }
        return 10; // this line won't be executed as return statement above exits the method
    }
}
