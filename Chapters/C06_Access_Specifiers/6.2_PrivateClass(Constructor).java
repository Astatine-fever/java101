package Chapter6_ACCESS_MODIFIERS;

class Private_CC {
  private Private_CC() {

  }// private constructor

  void msg() {
    System.out.println("Hello java");
  }
}

class Simple {
  public static void main(String args[]) {
    //Private_CC obj = new Private_CC();// Compile Time Error
  }
}
