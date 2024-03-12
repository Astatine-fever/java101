package Chapter7_CONSTRUCTOR; //Java program to overload constructors

class construct_ex1 {

  int id, age;
  String name;

  construct_ex1(int i, String n) { // creating two arg constructor
    id = i;
    name = n;
  }

  construct_ex1(int i, String n, int a) { // creating three arg constructor
    id = i;
    name = n;
    age = a;
  }

  void display() {
    System.out.println(id + " " + name + " " + age);
  }

  public static void main(String args[]) {
    construct_ex1 windows = new construct_ex1(111, "Prasanna");
    construct_ex1 android = new construct_ex1(112, "Roobeswaran", 25);
    android.display();
    windows.display();
  }
}
