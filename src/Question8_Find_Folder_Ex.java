
/*
     Write a program to find all files of a folder and
     select only given extention fileName and read content of this file using byte array
 */

import java.io.File;
import java.util.Scanner;

public class  Question8_Find_Folder_Ex
{
    public static void main(String args[])
    {
        File folder = new File("/home/user/Documents/Java-Practise-Ex2/text1");
        File[] list_of_files = folder.listFiles();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the . extension file");
        String ext = sc.nextLine();

        
    }
}
