/**
 * e35_Function(Overriding)
 */
class e35_Function {
    public void tesla()
    {
        System.out.println("I am Murugesan");
    }

    public void honda()
    {
        System.out.println("I am Karthikeyan");
    }
    
}
class test extends e35_Function
{
    public void tesla()
    {
        System.out.println("I am Prasanna");
    }

    public static void main(String[] args) {
       
        test t = new test();
        t.tesla();
        t.honda();
    }
}