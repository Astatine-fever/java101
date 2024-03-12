package Chapter5_ARRAYS;

import java.util.Scanner;

class array_ex1 {

    public static void main(String[] args) {
        int inc, noe;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements for the array : ");
        noe = sc.nextInt();
        int ar1[] = new int[noe];
        for (inc = 0; inc < noe; inc++) {
            System.out.print("ar1[" + inc + "]: ");
            ar1[inc] = sc.nextInt();
        }

        for (inc = 0; inc < ar1.length; inc++) {
            System.out.println("ar1[" + inc + "] = " + ar1[inc]);
        }
    }
}
