package Chapter6_ACCESS_MODIFIERS;

// private class cannot be accessed outside the class. 

class Pc {

    private int data = 40; // private variable

    private void msg() // private method
    {
        System.out.println("Hello java" + data);
    }

    public void msg1() {
        System.out.println("Public method");
        msg();
    }
}

class Pc1 {
    public static void main(String args[]) {
        Pc obj = new Pc();
        // System.out.println(obj.data); //Compile Time Error
        //obj.msg(); // Compile Time Error
        obj.msg1();

    }
}
