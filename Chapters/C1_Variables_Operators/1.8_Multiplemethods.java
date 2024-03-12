class sample // class - container 
        //java class can contain methods and attributes(datatypes)
{
    public static int a=52,b=75,c,d;    
    
    public void add() // method 1 
    {
        
    c= a+b; // statement
    
    }        

    public void sub() // method 2
    {
       
    d=a-b; //statement
    
    }
    
    public void result() // method 3
    {
    add();
    sub();
    System.out.println("C="+c);
    System.out.println("D="+d);
    }

}

class mainf
{
public static void main(String args[])
{
sample s = new sample();
s.result();
s.add();
s.sub();
}
}      
