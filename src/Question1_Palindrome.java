/*
     Write a Java method to Reverse the given input & Check if it is a Palindrome.
 */

import java.util.*;
public class Question1_Palindrome
{
    public static void main(String args[]) {

        palindrome_check(); // calling the palindrome function

    }
    //Method to check whether given number is a Palindrome or not
    public static void palindrome_check(){
        try{
            int num, temp, sum;

            Scanner sc = new Scanner(System.in);

            //input an integer number
            System.out.println("Enter any integer number To Check if it is Palindrome or not: ");
            num = sc.nextInt();

            //find the reverse number
            temp = num;
            sum = 0;
            while (temp > 0) {
                sum = (sum * 10) + (temp % 10);
                temp /= 10;
            }

            //check Given number  with reversed number
            if (num == sum)
            {
                System.out.println(num + " is a Palindrome Number.");
            }
            else
            {
                System.out.println(num + " is not a Palindrome Number.");
            }
        }
        catch (Exception e){
            System.out.println("Error.!! Failed to execute the palindrome function ");
        }
    }
}
