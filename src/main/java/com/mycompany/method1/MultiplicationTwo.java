package com.mycompany.method1;

/**
*Define a method that returns the product of two numbers entered by the user.
*
*/
import java.util.Scanner;
public class MultiplicationTwo {
    public static void main(String[] args)
    {
        int a,b,mul;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=obj.nextInt();
        System.out.println("Enter the second number");
        b=obj.nextInt();
        mul=multiplication(a,b);
        System.out.println("multication of two integer is "+mul);
    }
    public static int multiplication(int a,int b)
    {
        return a*b;
    } 
}
