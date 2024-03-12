import java.util.Scanner;

class Logical_Operators 
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A value: ");
        a=sc.nextInt();//40
        System.out.println("Enter B value: ");
        b=sc.nextInt();//40
        if(a<b && a<10)
        {
            System.out.println("A is Less than B and Less than 10");
        }
        else if(a>b || a>10)
        {
            System.out.println("A is Greater than B or  Greater than 10");
        }
        else if(a==b != a<10)
        {
            System.out.println("A and B value is same");
        }
        else
        {
            System.out.println("A and B are same but both are less than 10");
        }
    }
}
