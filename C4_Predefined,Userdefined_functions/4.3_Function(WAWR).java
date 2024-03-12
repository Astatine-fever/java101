// Function with no Arguments and Returns 

import java.io.*;
import java.util.Scanner;
class Fun_01
{
public int sub(int a,int b) //function 1
{
int c;
c=a-b;
return 0;
}
public int add(int d,int e) // function 2 
{
int f;
f=d+e;
return f;
}
}
class main1
{
int num1,num2;
//main function 
public static void main (String [] args) throws IOException 
{
System.out.print("Enter the A and B Value \n");
Scanner sc= new Scanner(System.in);
main1 v = new main1();
v.num1=sc.nextInt();
v.num2=sc.nextInt();
Fun_01 s1 = new Fun_01();
int x=s1.sub(v.num1,v.num2);
int y=s1.add(v.num1,v.num2);
System.out.print(" The Addition of Num 1 and Num 2 is "+y);
System.out.print(" \n The Subtraction of Num 1 and Num 2 is "+x);
}
}
