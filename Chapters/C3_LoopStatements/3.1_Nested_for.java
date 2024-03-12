// Nested for loop 
import java.util.Scanner;

class loop_stmt2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a, b, i, j;
        Scanner so = new Scanner(System.in);
        System.out.println("Enter A and B values");
        a = so.nextInt();
        b = so.nextInt();
        for (i = 1; i <= a;) {
            for (j = i + 1; j < b; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
                i++;
            }
        }
    }

}
