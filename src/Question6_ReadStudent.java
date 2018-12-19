
/*
    Write a program, which reads number of students and n grades as input (of int between 0 and 100,
    inclusive) and displays the average, minimum and maximum.Your program shall check for valid input.
    You should keep all the grades in an int[] and use a method for each of the computations.
     Output:
    Enter the number of students: 4
    Enter the grade for student 1: 86
    Enter the grade for student 2: 65
    Enter the grade for student 3: 98
    Enter the grade for student 4: 77
    The average is 81.50
    The minimum is 65
    The maximum is 98
 */

import java.util.*;

public class Question6_ReadStudent {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students : ");
        int numOfStudents =  sc.nextInt();
        //student array to to store the data of the student
        int student[] = new int[numOfStudents];
        int i, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Double sum = 0.00;
        //to loop through the student and find the min , max adn average
        for(i=0;i<numOfStudents;i++)
        {
            System.out.println("Enter the grade for Student " + (i+1));
            student[i] = sc.nextInt();
            sum = sum + student[i];
            if(student[i] < min)
                min = student[i];
            if(student[i] > max)
                max = student[i];
        }
        Double avg = sum/numOfStudents;
        System.out.println("The average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
    }
}


