package com.mycompany.method1;

/**
 *Create a function called sum(int num1 , int num2 , int num3)  and 
 * inside the function return the sum of three numbers and 
 * display it in the part from where the function was called.
 
 */

import java.util.Scanner;
public class SumOfThreeNumber {
 public static void main(String[] args)
 {
    int num1,num2,num3;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the first number ");
    num1=obj.nextInt();
    System.out.println("Enter the first number ");
    num2=obj.nextInt();
    System.out.println("Enter the first number ");
    num3=obj.nextInt();
    Number sc=new Number();
    int d=sc.sum(num1, num2, num3);
    System.out.println("sum of three nuber "+d);
    
 }
}
class Number 
{
    int sum(int a,int b,int c)
    {
        return a+b+c;
        
    }

}
