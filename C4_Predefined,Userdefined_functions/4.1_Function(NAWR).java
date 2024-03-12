import java.util.Scanner;

// with argument with return
class fun_017 {
    int add(int number1, int number2) {
        
        int number3;
        
        number3 = number1 + number2;
        return number3;
    }

    public static void main(String[] args) {
        fun_017 f17 = new fun_017();
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        a = sc.nextInt();
        System.out.println("enter number 2 : ");
        b = sc.nextInt();
        c=f17.add(a,b);
        System.out.println("enter number 3 : "+c);
    }
}
