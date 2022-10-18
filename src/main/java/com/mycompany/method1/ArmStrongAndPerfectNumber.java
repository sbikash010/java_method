package com.mycompany.method1;

/**
 *Write a program in java to check armstrong and perfect numbers using the function.
 */
import java.util.Scanner;
public class ArmStrongAndPerfectNumber {
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit");
        num=sc.nextInt();
        isArmStrongNumber(num);
        isPerfectNumber(num);
        
    }
    public static void isArmStrongNumber(int num)
    {
        int a=num;
        int sum=0,rem;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+rem*rem*rem;
            a=a/10;
        }
        if(num==sum)
            System.out.println(num+" is armstrong number");
        else
            System.out.println(num+" is not armstrong number");
    }
    public static void isPerfectNumber(int num)
    {
        int b=num;
        int sum=0;
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==sum)
            System.out.println(num+" is perfect number");
        else
            System.out.println(num+" is not perfect number");
    }
}
