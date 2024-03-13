package Chapters.C05_Access_Specifiers;

// protected class can be accessed outside a class using inheritence

class A
{  
protected void msg()
{
    System.out.println("Hello");
}  
}  
  
class B extends A
{  
  public static void main(String args[])
    {  
        A obj = new A();  
        obj.msg();  
    }  
}