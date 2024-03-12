package Chapter12_THIS;

class this_ex4
{  
    void m(this_ex4 obj)
    {  
        System.out.println("method is invoked");  
    }  
    void p()
    {  
        m(this);  
    }  
    public static void main(String args[])
    {  
    this_ex4 s1 = new this_ex4();  
    s1.p();  
    }  
  }