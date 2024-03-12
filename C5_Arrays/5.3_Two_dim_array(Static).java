package Chapter5_ARRAYS;
// A sample multidimensional array with predefined values 

class as {
    public static void main(String args[]) {
        // declaring and initializing 2D array
        int arr[][] = { { 2, 7, 9, 4 }, { 3, 6, 1, 5 }, { 7, 4, 2, 7 }, { 3, 4, 5, 7 } };
        // printing 2D array
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}