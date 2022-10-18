package com.mycompany.method1;

/**
 *WAP to print the multiplication table of a number 
 using a function printMultiplication(int inputNumber)
 */
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        num=sc.nextInt();
        printMultiplication(num);
    }
    public static void printMultiplication(int inputNumber)
    { 
        int a=inputNumber;
        int mul;
       System.out.println("Multiplication number of  "+a);
       for(int i=1;i<=10;i++)
       {
          mul=a*i;
          System.out.println(a+"*"+i+"="+mul); 
       }
    }
}
