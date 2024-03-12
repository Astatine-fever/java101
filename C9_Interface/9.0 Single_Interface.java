package Chapter9_INTERFACE;

interface Single_Interface { // Interface Declaration
  void sample_method(); // method declaration without body
}

class simple
  implements Single_Interface { // class implementing the interface

  public void sample_method() { // method definition inside the class
    System.out.println("Single Inheritence Example");
  }

  public static void main(String[] args) {
    simple si = new simple();
    si.sample_method();
  }
}
