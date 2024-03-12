package Chapter11_EXCEPTION;

import java.io.*;

class exc_demo4 {
    public static void main(String args[]) {
        FileInputStream input1 = null;
        /*
         * the statements inside the try block will be executed
         * and any exception will be recorded by the catch block
         */

        try {
            int a[]={1,3,4,5,6,7,8};
            input1 = new FileInputStream("H:/IDE/Workspace/Java/ex/sample.txt");
            int m = 1 / 0;
            a[6]=75;
            System.out.print("M=" + m);
        } catch (FileNotFoundException input2) {
            System.out.println("The file does not " + "exist at the location");
        } catch (ArithmeticException m) {
            System.out.println("You cannot divide any number by zero");
        }
        System.out.println(a[6]);

        int m;
        try {
            while ((m = input1.read()) != -1) {
                System.out.print((char) m);
            }
            input1.close();
        } catch (Exception input3) {
            System.out.println("I/O error occurred: " + input3);
        }
    }
}