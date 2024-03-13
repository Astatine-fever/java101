package Chapters.C21_Java_Generics;


interface MyGenericInterface<T> {
    T myMethod(T value);
}




public class e211_Java_Generic_Interface implements MyGenericInterface<Integer> {
    @Override
    public Integer myMethod(Integer value) {
        return value * 2;
    }


public static void main(String[] args) {
    e211_Java_Generic_Interface obj = new e211_Java_Generic_Interface();
    System.out.println(obj.myMethod(5));
    
   
}
}

