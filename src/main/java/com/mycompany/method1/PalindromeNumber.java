
package com.mycompany.method1;

/**
 *Write a method that takes as input a nonnegative integer and returns true if 
 the number is a palindrome; otherwise, it returns false. 
 Also write a program to test your method.
 */
import java.util.Scanner;
public class PalindromeNumber {
     public static void main(String[] args)
    {
        int mark;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit  ");
        mark=sc.nextInt();
        if(testNumber(mark))
            System.out.println(mark+" is palindrome");
        else
            System.out.println(mark+" is not palindrome");
    }
     public static boolean testNumber(int mark)
     {
         int a=mark;
         int rem,rev=0;
         while(a!=0)
         {
             rem=a%10;
             rev=rev*10+rem;
             a=a/10;
         }
         if(mark==rev)
         {
            return true;
         }
         return false;
         
       
     }
}
