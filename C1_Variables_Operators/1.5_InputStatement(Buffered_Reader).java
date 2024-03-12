
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Buffered_Reader {

    public static void main(String[] args) throws IOException {
        String a, b;
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader Br = new BufferedReader(r);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line into A");

        a = Br.readLine();
        System.out.println("Enter a Line into A");
        b = sc.next();

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }

}
