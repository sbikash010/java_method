package com.mycompany.method1;
/**
 *Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
  Call this method from main( ) and print the results.
  
 */
public class Sum {
    
    public static void main(String[] args)
    {
      Sum obj=new Sum();
      int sum1=obj.getTotal(20,30);
      System.out.println("sum of integer is "+sum1);
      
    }
    int getTotal(int a,int b)
    {
      
        return a+b;
    }
}
