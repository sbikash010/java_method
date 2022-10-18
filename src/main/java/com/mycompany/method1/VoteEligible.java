package com.mycompany.method1;

/**
 * A person is eligible to vote if his/her age is greater than or equal to 18. 
  Define a method to find out if he/she is eligible to vote.
 */

import java.util.Scanner;
public class VoteEligible {
    public static void main(String[] args)
    {
       int age;
       Scanner obj=new Scanner(System.in);
       
       System.out.println("age of person is ");
       age=obj.nextInt();
       Elligible eli=new Elligible(age);
       
    }
}
class Elligible{
    Elligible(int age)
    {
        if(age>=18)
            System.out.println(age+" Elligible for the vote");
        else
            System.out.println(age+" not Elligible for the vote");
    }
}
