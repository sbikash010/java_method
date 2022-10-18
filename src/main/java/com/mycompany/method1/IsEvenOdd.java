
package com.mycompany.method1;

/*
*WAP to check whether a number is even or odd using function. The function name should be isEven(int parameter), 
*which returns true if the number is even and return false if the number is  odd.
*/
import java.util.Scanner;
public class IsEvenOdd {
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number is ");
        num=sc.nextInt();
        Number obj=new Number();
       if(evenodd(num)==true)
           System.out.println(num+" is even number ");
       else
           System.out.println(num+" is odd number ");
    }
    public static boolean evenodd(int num)
    {
        return (num%2==0);
    }
}