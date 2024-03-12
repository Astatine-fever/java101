package Chapter9_INTERFACE;

abstract class Bike // abstract class
{
  abstract void run(); // abstract method
}

class Honda4 extends Bike // normal class inherits abstract class
{
  void run() // method defintion
  {
    System.out.println("running safely");
  }

  public static void main(String args[]) {
    Bike obj = new Honda4();
    obj.run();
  }
}