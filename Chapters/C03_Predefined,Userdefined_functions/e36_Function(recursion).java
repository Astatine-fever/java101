class Recurve {
    static int count = 10;

    static void loopmethod() // recursive function
    {

        
        if (count >= 0) {

            System.out.println("hello " + count);
            count--;
            loopmethod();
        }
    }

    public static void main(String[] args) {
        loopmethod();
    }
}