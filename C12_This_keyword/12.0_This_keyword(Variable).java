package Chapter12_THIS;

class this_ex 
{
    int rollno;  
    String name;  
    float fee;  
    this_ex(int rno,String name,float fee) // constructor with this keyword 
    {  
        this.rollno=rno;  
        this.name=name;  
        this.fee=fee;  
         
        
    }  
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }  
}  
      
    class testing_this_ex
    {  
        public static void main(String args[])
        {  
    this_ex s1=new this_ex(111,"hari",25000.25f);  
    this_ex s2=new this_ex(112,"ravi",18000.450f);  
    s1.display();  
    s2.display();  
    }}  