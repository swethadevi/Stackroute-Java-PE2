
/*
    Create a class named Member with Name, age, Salary as its variable,
    write an other class named Member Variable that creates an instance of the Member class,
    initialises its member variables, and then displays the value of each member variable.
    Output:
    Members Name: Harry Potter
    Members Age: 30
    Members Salary: 2500.3
 */

import java.util.*;

//Member class
class Member{
    String name;
    int age;
    Double salary;
}

//Member variable classs
class Member_Variable{
    Member mb = new Member(); // creating an object for the Member class
    Member_Variable(String name, int age, Double salary) // Member_Variable constructor to initialise the variables for the member class
    {
        mb.name = name;
        mb.age = age;
        mb.salary = salary;
    }
}

//Main class method
public class Question3_MemberClass
{
    public static void main(String args[]) {
        Member_Variable mb_var = new Member_Variable("Harry Potter", 30, 2500.3);
        System.out.println("Members name : " + mb_var.mb.name);
        System.out.println("Members age : " + mb_var.mb.age);
        System.out.println("Members salary : " + mb_var.mb.salary);
    }
}

