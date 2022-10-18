package com.mycompany.method1;

/**
 *Write a Java method to check whether a string is a valid password
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
Password is valid: abcd1234

 
 */
import java.util.Scanner;
public class ValidPassword {
    public static final int password_length=10;
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.\n" +    
                 "2. A password consists of only letters and digits.\n" + 
                 "3. A password must contain at least two digits \n"+"Enter the password(above the codition).\n" );
        str=sc.nextLine();
        if(isValidPassword(str))
           System.out.println("valid password "+str);
        else{
            System.out.println("Invalid password "+str);
            System.out.println("try again");
        }
        
    }
    public static boolean isValidPassword(String str)
    {
      if (str.length() < password_length) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (is_number(ch)) numCount++;
            else if (is_charater(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
      }
    public static boolean is_number(char ch)
    {
        return (ch >= '0' && ch <= '9');
    }
    public static boolean is_charater(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    
}
