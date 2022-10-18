package com.mycompany.method1;

/**
 *Create a function that returns true 
 * when both the parameters are equal else return false. isSameNum(4, 8) ➞ false
 */
public class EqualNumberTest {
    public static void main(String[] args)
    {
        if(isSameNum(4,8))
            System.out.println("false");
        else
            System.out.println("true");
    }
    public static boolean isSameNum(int a,int b)
    {
        boolean isSameNum=true;
        if(a!=b)
        {
            return true;
        }
        return isSameNum;
    }
}
