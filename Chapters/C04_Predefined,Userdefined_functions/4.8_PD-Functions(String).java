class string_functions1 {

  public static void main(String args[]) {
    String text = "Sample Text", b, c = "";
    int a = 100;
    // String.valueOf
    b = String.valueOf(a); // converts int to String
    System.out.println(b + 10);
    // length
    int sl = text.length();
    System.out.println("Length of the String is " + sl);
    // empty
    System.out.println("Is Given String empty " + c.isEmpty());
    // substring
    String n1 = text.substring(3, 8);
    System.out.println("Substring of Text is " + n1);
    // equals
    String name = "Prasanna", name1 = "Priya";
    System.out.println("Is name 1 equals to name 2 " + name1.equals(name));
    // concats
    String name3 = "Prasanna", name5 = "Priya";
    String name4 = (name3).concat(name5);
    System.out.println("Is name 1 and name 2 combine " + name4);
    // replace
    System.out.println(name4.replace("r", "S"));
    // toUpper and Lower

    System.out.println("Upper case of name 1 " + name1.toUpperCase());
    System.out.println("Upper case of name 1 " + name1.toLowerCase());
    // trim
    String Text1 = "     A Sample text        ";
    System.out.println(Text1);
    System.out.println(Text1.trim());
  }
}
