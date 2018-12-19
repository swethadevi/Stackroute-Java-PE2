
/*
    Write a program to list all the factorials,
    that can be expressed as an int (i.e., 32-bit signed integer).
    Your output shall look like:
    Int Factorials:
    The factorial of 1 is 1
    The factorial of 2 is 2
         ..........
    The factorial of 12 is 479001600
    he factorial of 13 is out of rang
    Modify your program and add a method called longFactorial
    to list all the factorial that can be expressed as a long (64-bit signed integer).
    The maximum value for long is kept in a constant called Long.MAX_VALUE.
    your output shall look like:
    Long Factorials:
        The factorial of 1 is is 1.
        The factorial of 2 is is 2.
                ..........
        The factorial of 20 is is 2432902008176640000.
        The factorial of 21 is out of range.
 */

import java.util.*;

public class Question7_Factorial_FInd {
    //Method to find the factorial of a Int for 32 signed int
    static void intFactorial()
    {
        int i = 0;
        int int_var = 1;
        //loop while the variable is greatear than 1
        while(int_var > 0)
        {
            i++;
            System.out.println("The factorial of " + (i-1) + " is : " + int_var);
            int_var = int_var * i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }
    //Method to find the factorial of a long Int number for 64 signed ling int
    static void longFactorial()
    {
        int i = 0;
        long long_var = 1;
        //loop while the variable is greatear than 1
        while(long_var > 0)
        {
            i++;
            System.out.println("The factorial of " + (i-1) + " is : " + long_var);
            long_var = long_var * i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }
    //public main method
    public static void main(String args[])
    {
        intFactorial();
        System.out.println();
        longFactorial();
    }
}
