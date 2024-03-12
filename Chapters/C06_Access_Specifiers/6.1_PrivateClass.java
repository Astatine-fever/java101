package Chapter6_ACCESS_MODIFIERS;

class security_t
{
 static int a=5;
}

class accesser_t
{
    public static void main(String[] args) {
       security_t.a=25;
       System.out.println(security_t.a); 
    }
}