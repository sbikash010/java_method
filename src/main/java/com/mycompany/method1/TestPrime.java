package com.mycompany.method1;

/**
 *WAP that check a prime number boolean checkPrime(int testNumber)
 
 */
import java.lang.*;
import java.util.Scanner;
public class TestPrime {
   public static void main(String[] args)
   {
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number ");
       num=sc.nextInt();
       
        if (checkPrime(num))
            System.out.println(num+" is prime number");
 
        else
             System.out.println(num+" is  Not prime number");
       
   }
   public static boolean checkPrime(int testNumber)
   {
       int n=testNumber;
       boolean checkPrime=true; 
       for(int i=2;i<=n/2;i++)
       {
           if(n%i==0){
               checkPrime=false;
           }
       }
       return checkPrime ;
   }

}
