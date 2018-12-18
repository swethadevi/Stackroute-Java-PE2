/*
    Write a Java method to check if a given number is power of 4
 */

import java.util.*;
import java.math.*;

public class Question2_PowerOf4 {
    public static void main(String[] args) {

        Find_PowerOf4();  //calling the power function

    }

    //Method to find the Power of 4
    public static boolean Find_PowerOf4() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number to check if it is a Power of 4 is \n");
            int number = sc.nextInt();

            if(number==0) {
                return false;
            }

            int pow_check = (int) (Math.log(number) / Math.log(4));
            if(number == Math.pow(4, pow_check)){
                System.out.println("The given number is a power of 4 \n");
                return true;
            }
            else{
                System.out.println("The given number is not a Power of 4 (-_-)");
                return false;
            }
        }
        catch(Exception e){
            System.out.println("failed to find the Power function");
            return false;
        }

    }
}

