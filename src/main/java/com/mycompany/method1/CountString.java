package com.mycompany.method1;

/**
 *Write a java program to count all the words of a string .
 Example : I want to be a software engineer. Output : 7
 */
public class CountString {
    public static void main(String[] args)
    {
        String st="I want to be a software engineer";
        countString(st);
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
