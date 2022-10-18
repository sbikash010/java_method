/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.method1;

import java.util.Scanner;

/**
 *Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false. 
 In main() method accept a string from the user and count the number of vowels in that string.
 */
import java.util.Scanner;
public class TestvowelConsonant {
   public static void main(String[] args)
    {
        String mark,st;
        Scanner sc=new Scanner(System.in);
        System.out.println(" string are ");
        mark=sc.next();
        st=sc.nextLine();
        System.out.println("Given the string");
        st=sc.nextLine();
        
        if(isVowel(mark))
            System.out.println(mark+" is vowel");
        else
            System.out.println(mark+" is consonant");
        
        countString(st);
      } 
   
   public static boolean isVowel(String mark)
   { 
       String a=mark;
       if(a.equals("a") ||a.equals("e") || a.equals("i") || a.equals("o") ||a.equals("u"))
       {
           return true;
       }
       return false;
     }
   public static void countString(String st)
    {
      int count = 0;
        if (!(" ".equals(st.substring(0, 1))) || !(" ".equals(st.substring(st.length() - 1))))
        {
            for (int i = 0; i < st.length(); i++)
            {
                if (st.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
       System.out.print("count of string is "+count);  
    }
   
   }