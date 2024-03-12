package Chapter8_INHERITANCE;
import java.util.Scanner;
// class 1
class Single_inher_Parent { 

  int l;
  void eat() { // method1
    System.out.println("eating...");
  }
}
// class2
class Single_inher_Child
  extends Single_inher_Parent { 

  void bark() { // method 2
    System.out.println("barking...");
  }
}
// main class
class Single_inheritance { 

  public static void main(String args[]) {
    Single_inher_Child d = new Single_inher_Child();
    d.bark();
    d.eat();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    d.l = sc.nextInt();
    System.out.println("d = " + d.l);
  }
}
