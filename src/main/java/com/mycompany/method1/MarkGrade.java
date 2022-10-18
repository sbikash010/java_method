package com.mycompany.method1;

import java.util.Scanner;

/**
 *Write a program which will ask the user to enter his/her marks (out of 100). 
 Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail

 */
import java.util.Scanner;
public class MarkGrade {
     public static void main(String[] args)
    {
        int mark;
        Scanner sc=new Scanner(System.in);
        System.out.print("The student gets mark out of 100 is  ");
        mark=sc.nextInt();
        display(mark);
    }
     public static void display(int mark)
     {
         int a=mark;
         if(a>91 && a <100)
             System.out.print("The student gets mark whose has grade AA ");
         else if(a>81 && a <90)
             System.out.print("The student gets mark whose has grade AB ");
         else if(a>71 && a <80)
             System.out.print("The student gets mark whose has grade BB ");
         else if(a>61 && a <70)
             System.out.print("The student gets mark whose has grade BC ");
         else if(a>51 && a <60)
             System.out.print("The student gets mark whose has grade  CD ");
         else if(a>41 && a <50)
             System.out.print("The student gets mark whose has grade DD ");
         else
             System.out.print("The student gets mark whose is fail in exam");
     }
}
