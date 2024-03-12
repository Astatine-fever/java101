import java.util.*;

class loop_stmt1
{
public static void main(String args[])
{
   int a,i=0;
   System.out.println("Enter A Value");
   @SuppressWarnings("resource")
   Scanner sc = new Scanner(System.in); 
   {
      a=sc.nextInt();
   } 
   for(;i<a; )//for(initialization(opt);condition;inc/dec(opt))
   {
      System.out.println(i);
      i++;
   }
}
}