package Chapters.C02_Control_flow_Statements;

public class e212_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // exit the loop when i reaches 3
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop ended.");
    }
}
