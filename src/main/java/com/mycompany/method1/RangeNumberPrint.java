package com.mycompany.method1;

/*
WAP that displays all the numbers from range void display(int start , int end)
WAP that displays all the odd numbers from range void displayOddNumbers(int start , int end)

*/
import java.util.Scanner;
public class RangeNumberPrint {
    public static void main(String[] args)
    {
        int first,last;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        first=sc.nextInt();
        System.out.println("Enter the first number ");
        last=sc.nextInt();
        Range obj=new Range();
        obj.display(first, last);
        obj.odd(first,last);
        
    }
}
class Range{
    int i;
    void display(int a,int b)
    {
        System.out.println("number from "+a+" to "+b);
        for(i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
    
    void odd(int x,int y)
    {
        System.out.println("odd number are ");
        for(int i=x;i<=y;i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
            
        }
    }
}

