
/*
    Write a program to read the content of a text file, convert the content in upper case
    and print the same in console along with the length of the file.
 */

 import java.io.*;
 import java.util.*;

class Question4_ReadContentFile{

    public static void main (String[] args) {
        try
        {
            //opening the file to read
            FileReader file_r = new FileReader("/home/user/Documents/Java-Practise-Ex2/text1");
            BufferedReader br = new BufferedReader(file_r);
            //writing the contents of the text file to new file
            PrintWriter out = (new PrintWriter(new FileWriter("swetha.txt")));
            String str=""; // initialising the variable with empty string

            //to loop through the text file
            while((str = br.readLine()) != null)
            {
                out.write(str.toUpperCase()+ "\n");
            }
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}