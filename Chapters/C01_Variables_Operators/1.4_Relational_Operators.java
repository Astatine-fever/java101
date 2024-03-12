
import java.util.Scanner;
class Relational_Operators 
{
public static void main(String args[])
{
 int a,b;
 Scanner Sc = new Scanner(System.in);
 System.out.print("Enter A and B value");
 a=Sc.nextInt();
 b=Sc.nextInt();
 if(a<b)
 {
 System.out.print("A is Small,B is Big \n");    
 }
 else if(a>b)
 {
 System.out.print("A is Big,B is Small \n");    
 }
 else if(a==b)
 {
 System.out.print("A and B are Equal \n");    
 }
 
}
}
