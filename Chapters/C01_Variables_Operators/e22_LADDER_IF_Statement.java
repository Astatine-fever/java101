package Chapters.C02_Control_flow_Statements;


// Ladder if  Statement 
import java.util.*;

class newas {
	public static void main(String Args[]) {
		boolean a;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you above 18 \n");
		System.out.println(" If Yes type true \n If No type false \n ");
		a = sc.nextBoolean();
		if (a == true) {
			System.out.println(" The option you chooose is Yes");
		} else if (a == false) {
			System.out.println(" The option you chooose is No");
		} else {
			System.out.println(" Please Choose Yes or no ");
		}
	}
}