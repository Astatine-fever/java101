package Chapters.C08_Interface;

interface rajendran {
  void test1();
}

interface annapoorani {
  void test2();
}

class nithaysri implements rajendran, annapoorani {

  public void test1() {
    System.out.println("My name is ramanathan");
  }

  public void test2() {
    System.out.println("My name is rajathi ");
  }

  public static void main(String[] args) {
    nithaysri H = new nithaysri();
    H.test1();
    H.test2();
  }
}
