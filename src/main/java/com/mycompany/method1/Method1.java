package com.mycompany.method1;

/*Create a class called MainProgram and inside the class create a function called display() with no parameters and 
inside a body of display method add a line “Hello, I am called”. Call the function 
from the main method of MainProgram by creating the object of MainProgram.
*/
public class Method1 {

    public static void main(String[] args) {
        MainProgram obj=new MainProgram();
        obj.display();
    }
}
class MainProgram{
    void display()
    {
        System.out.println("hello,I am call");
    }
}

