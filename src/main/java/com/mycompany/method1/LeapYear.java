
package com.mycompany.method1;

/**
 *Write a Java method to check whether a year (integer) entered by the user is a leap year or not
Expected output:
Input a year: 2017
false
 
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the year ");
        year=sc.nextInt();
        if(isLeapYear(year))
            System.out.println(year+ " is leap year");
        else
            System.out.println(year+" is not leap year");
   
    }
    public static boolean isLeapYear(int year)
    {
        int a=year;
        boolean isLeapYear=true;
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                {
                    
                   isLeapYear=true;
                }
                else{
                     isLeapYear=false;
                }
            } 
          }
        else
        {
        isLeapYear=false;
        }
        return isLeapYear;
    }
    
}
