class Recurve {
    static int count = 10;

    static void loopmethod() // recursive function
    {

        count--;
        if (count >= 0) {
            System.out.println("hello " + count);

            loopmethod();
        }
    }

    public static void main(String[] args) {
        loopmethod();
    }
}