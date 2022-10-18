package com.mycompany.method1;

/**
 *WAP that displays all the prime numbers between 1 and 1000. 
 Use the above checkPrime function to identify the prime number.
 
 */
import java.util.Scanner;
public class PrintPrimeNumber {
     public static boolean checkPrime(int n)
    {    
        if(n==1 || n==0) return false;
 
        for(int i=2;i<n;i++)
         {
             if(n%i==0) return false;
            }
        return true;
        
        
    }
    public static void main(String[] args)
    {
        int lastnum;
        Scanner sc=new Scanner(System.in);
        System.out.print( "Enter the last number  ");
        lastnum=sc.nextInt();
         System.out.print( "prime number from 1 to "+lastnum);
       for(int i=1; i<=lastnum; i++){
            if(checkPrime(i)) {
                System.out.print(" "+i);
            }
       }
    }
   
}
