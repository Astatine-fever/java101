package Chapters.C08_Interface;

import java.util.Scanner;

interface Drawable {
    void draw();

    default int msg() {
        System.out.println("my name is roobeswaran");
        return 0;
    }

    default int msg1(){
        int x;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class mymainclass {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        int f;
        d.draw();
        d.msg(); // default method calling
        f = d.msg1();
        System.out.println("F=" + f);
    }
}