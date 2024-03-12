
import java.util.Scanner;

class inputclass 
{
public static void main(String args[])
{
int s_no;
String name;
float height;
Scanner raji = new Scanner(System.in);
System.out.println("Kindly Enter your S_no");
s_no=raji.nextInt();
System.out.println("Enter your Name");
name=raji.next();
System.out.println("Enter your Height");
height=raji.nextFloat();
System.out.println("S_no:"+s_no);
System.out.println("Name:"+name);
System.out.println("Height:"+height);
}
}
