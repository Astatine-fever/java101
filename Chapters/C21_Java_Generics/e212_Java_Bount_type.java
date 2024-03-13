package Chapters.C21_Java_Generics;

public class e212_Java_Bount_type<T extends Number> {
    private T data;

    public e212_Java_Bount_type(T data) {
        this.data = data;
    }

    public double square() {
        return data.doubleValue() * data.doubleValue();
    }

    public static void main(String[] args) 
    {
        e212_Java_Bount_type<Integer> intObj = new e212_Java_Bount_type<>(5);
        System.out.println(intObj.square()); // Output: 25.0

        //e212_Java_Bount_type<String> strObj = new e212_Java_Bount_type<>("Hello");

    }

}

