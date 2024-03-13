package Chapters.C04_Collections;

class array_ex5 {
    public int roll_no;
    public String name;

    array_ex5(int roll_no, String name)// constructor
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

// Elements of the array are objects of a class array_ex5.
class array_ex5_0 {
    public static void main(String[] args) {
        
        array_ex5[] arr;          // declares an Array of integers.
        arr = new array_ex5[5];   // allocating memory for 5 objects of type array_ex5.

        
        arr[0] = new array_ex5(1, "Prasanna"); // initialize the first elements of the array
        arr[1] = new array_ex5(2, "Priya");    // initialize the second elements of the array
        arr[2] = new array_ex5(3, "Balaguru");
        arr[3] = new array_ex5(4, "Kaviyarasu");
        arr[4] = new array_ex5(5, "Harishankar");
        
        for (int i = 0; i < arr.length; i++)  // accessing the elements of the specified array
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no + " " + arr[i].name);
    }
}
