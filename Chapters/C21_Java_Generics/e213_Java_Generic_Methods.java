package Chapters.C21_Java_Generics;

public class e213_Java_Generic_Methods {
    public <T> void mysampleMethod(T arg) 
    {
            System.out.println("Data Received :"+arg );
    }

    public static void main(String[] args) {
        e213_Java_Generic_Methods e = new e213_Java_Generic_Methods();
        e.mysampleMethod(76);
    }
}
    
    
