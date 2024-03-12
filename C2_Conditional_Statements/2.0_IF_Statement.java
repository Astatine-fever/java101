
//SIMPLE IF STATEMENT
import java.util.Scanner;
class calc 
{
	public static void main(String[] args) 
	{
		int number;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to see if it negative");
		number=sc.nextInt();
		if (number<0) 
		{
			System.out.println("Given number is negative");
		}
		System.out.println("Given number is "+number);			
	}
}