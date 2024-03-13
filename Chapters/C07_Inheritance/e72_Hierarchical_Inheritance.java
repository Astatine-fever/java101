package Chapters.C07_Inheritance;

class animal // Parent
{
    void eat() {
        System.out.println("eating...");
    }
}

class dog extends animal // child1
{
    void bark() {
        System.out.println("barking...");
    }
}

class cat extends animal // child2
{
    void meow() {
        System.out.println("meowing...");
    }
}

class Hierar_inhrt {
    public static void main(String args[]) {
        cat c = new cat();
        c.meow();
        c.eat();
        // c.bark();//C.T.Error
    }
}