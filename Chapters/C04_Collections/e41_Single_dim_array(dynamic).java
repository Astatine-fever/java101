package Chapters.C04_Collections;

import java.util.Scanner;

class array_ex1 {

    public static void main(String[] args) {
        int inc, noe=0; //increment and number of elements
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array ");
        noe=sc.nextInt();
        int array[]=new int[noe];
        for(inc=0;inc<noe;inc++)
        {
            System.out.print("array element ["+inc+"] = ");
            array[inc]=sc.nextInt();
        }
        for(inc=0;inc<noe;inc++)
        {
            System.out.println("array element ["+inc+"] = "+array[inc]);
        }
        
    }
}