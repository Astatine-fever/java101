package Chapter5_ARRAYS;
import java.util.*;
class array_ex4 {
	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];// declaration
		System.out.print("Elements to Store in Array :\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Elements in Array are :\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}