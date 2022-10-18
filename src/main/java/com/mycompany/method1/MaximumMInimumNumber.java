package com.mycompany.method1;

/**
 *Define two methods to print the maximum and minimum number respectively 
 among three numbers entered by the user.
 */
import java.util.Scanner;
public class MaximumMInimumNumber {
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number ");
        num1=sc.nextInt();
        System.out.print("Enter second number ");
        num2=sc.nextInt();
        System.out.print("Enter tird number ");
        num3=sc.nextInt();
        maximum(num1,num2,num3);
        minimum(num1,num2,num3);
    }
    public static void maximum(int num1,int num2,int num3)
    {
        if(num1>num2 && num1>num3)
            System.out.println(num1+" is maximum number  ");
        else if(num2>num1 && num2>num3)
             System.out.println(num2+" is maximum number  ");
        else
             System.out.println(num3+" is maximum number  ");
    }
    public static void minimum(int num1,int num2,int num3)
    {
        if(num1<num2 && num1<num3)
            System.out.println(num1+" is minimum number  ");
        else if(num2<num1 && num2<num3)
             System.out.println(num2+" is miniimum number  ");
        else
             System.out.println(num3+" is minimum number  ");
    }
}
