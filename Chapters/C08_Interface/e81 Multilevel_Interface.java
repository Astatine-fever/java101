package Chapters.C08_Interface;

interface vehicle { // Interface1
  void car();
}

class person1
  implements vehicle { // class1 implements the interface

  public void car() {
    System.out.println("Car is used to go for travel");
  }
}

class person2
  implements vehicle { // class 2 also implements the interface

  public void car() {
    System.out.println("Car is used to go for work");
  }
}

class test1 {

  public static void main(String[] args) {
    person1 p1 = new person1();
    person2 p2 = new person2();
    p1.car();
    p2.car();
  }
}
