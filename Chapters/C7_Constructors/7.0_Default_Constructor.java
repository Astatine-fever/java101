package Chapter7_CONSTRUCTOR; //Java Program to create and call a default constructor

class construct_ex0 { // --> Class name

  construct_ex0() { // --> Constructor name
    System.out.println("Bike is created");
  }

  public void car() {
    System.out.println(" Car is created");
  }

  public static void main(String args[]) { // main method
    construct_ex0 bc = new construct_ex0(); // class name objectname = new(keyword) constructor ;
    bc.car();
  }
}
