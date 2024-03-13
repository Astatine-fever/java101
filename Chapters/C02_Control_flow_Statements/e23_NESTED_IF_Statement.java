package Chapters.C02_Control_flow_Statements;


import java.util.*;

//Java Program to demonstrate the use of Nested If Statement.    
class jnif {
    public static void main(String[] args) {
        int age;
        float weight;
        System.out.println("Age and Weight");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        weight = sc.nextFloat();
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }
}