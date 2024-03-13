package Chapters.C21_Java_Generics;

public class e210_Java_Generic_Class<s> 
{
    s obj;
    e210_Java_Generic_Class(s obj) { this.obj = obj; } // constructor
    public s getObject() { return this.obj; }
}
 
// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        e210_Java_Generic_Class<Integer> iObj = new e210_Java_Generic_Class<Integer>(15);
        System.out.println(iObj.getObject());
 
        // instance of String type
        e210_Java_Generic_Class<String> sObj
            = new e210_Java_Generic_Class<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
