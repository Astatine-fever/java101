
import java.util.Scanner;

class loop_stmt3 {
    public static void main(String[] args) {
        int starting, ending;
        
            @SuppressWarnings("resource")
            Scanner sca = new Scanner(System.in);
            System.out.println("Enter Starting Value");
            starting = sca.nextInt();
            System.out.println("Enter ending Value");
            ending = sca.nextInt();
        
        while (starting < ending) {
            System.out.println(starting);
            starting++;
        }
    }
}
