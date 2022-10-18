package com.mycompany.method1;


/*
*Write a program to print the circumference and area of a circle of radius entered by the user 
by defining your own method.
*/
import java.util.Scanner;
public class Circle {
    public static void main(String[] args)
    {
        int r;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the radius");
        r=obj.nextInt();
        cir(r);
    }
    public static void cir(int r)
    {
        float peri,area;
        float pi=3.14f;
        peri=2*pi*r;
        area=pi*r*r;
        System.out.println("perimeter of circle is "+peri);
        System.out.println("area of circle is "+area);
        
    }
}

