package Chapter11_EXCEPTION;

// This Example uses the throws keyword to remove the IOException

import java.io.*;
class exc_demo3
{
    public static void main(String args[]) throws IOException 
{
        FileInputStream input1 = null;
        input1 = new FileInputStream("H:/IDE/Workspace/Java/ex/sample.txt");

        int m;
        while ((m = input1.read()) != -1) {
            System.out.print((char)m);
        }

        input1.close();
    }
}

