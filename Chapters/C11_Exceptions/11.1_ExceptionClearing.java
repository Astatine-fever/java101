package Chapter11_EXCEPTION;

import java.io.*;
class exc_demo1 
{
    public static void main(String args[]) throws IOException 
{
        FileInputStream input1 = null;
        input1 = new FileInputStream("D:/bala/anand.txt");

        int m;
        while ((m = input1.read()) != -1) {
            System.out.print((char)m);
        }

        input1.close();
    }
}