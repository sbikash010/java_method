package com.mycompany.method1;
/*
Create a function called averageNumber(int num1 , int num2 , int num3)  and
inside the function display the highest and lowest among three numbers.
*/
import java.util.Scanner;
public class HigestAndLowestNUmber {
 public static void main(String[] args)
 {
    float num1,num2,num3;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the first number ");
    num1=obj.nextFloat();
    System.out.println("Enter the first number ");
    num2=obj.nextFloat();
    System.out.println("Enter the first number ");
    num3=obj.nextFloat();
    Number sc=new Number();
    sc.average(num1, num2, num3);
    sc.largest(num1, num2, num3);
    sc.smallest(num1, num2, num3);
 }
}
class Number 
{
    void average(float a,float b,float c)
    {
       float sum=a+b+c;
       float averg=(sum/3);
      System.out.println("avaerage of "+a+","+b+"and"+c+"="+averg);
    }
   void largest(float a,float b,float c)
   {
       if(a>b && a>c)
       {
        System.out.println(a+" is largest value");
       }
       else if(b>a && b>c)
           System.out.println(b+" is largest value");
       else
           System.out.println(c+" is largest value");
   }
   void smallest(float a,float b,float c)
   {
       if(a<b && a<c)
       {
        System.out.println(a+" is smallest value");
       }
       else if(b<a && b<c)
           System.out.println(b+" is smallest value");
       else
           System.out.println(c+" is smallest value");
   }
   
}
