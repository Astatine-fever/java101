package Chapters.C02_Control_flow_Statements;

public class e211_Continue {
       public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // skip the iteration when i equals 2
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop ended.");
    }
}
