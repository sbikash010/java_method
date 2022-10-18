package com.mycompany.method1;

/**
 *Write a program in java  to swap two numbers using a function.
 */
import java.util.Scanner;
public class SwapTwoNumber {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        System.out.println("before swap number "+num1+" and "+num2);
        swapNumber(num1,num2);
    }
    public static void swapNumber(int num1,int num2)
    {
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swap number "+num1+" and "+num2);
    }
}
