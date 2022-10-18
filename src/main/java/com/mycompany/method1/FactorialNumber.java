package com.mycompany.method1;

/*
* Write a program to print the factorial of a number by defining a method getFactorial(int number).
*/
import java.util.Scanner;
public class FactorialNumber {
   public static void main(String[] args)
   {
       int num;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the number ");
       num=obj.nextInt();
       Factorial fac=new Factorial();
       fac.getfact(num);
       
   }
}
class Factorial{
    void getfact(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
          f=f*i;  
        }
        System.out.println("factorial of "+a+"="+f);
    }
}
