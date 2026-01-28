import java.util.*;
import java.io.*;
import java.security.MessageDigest;

public class program57_5
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

        // Accept directory name
        System.out.print("Enter directory path: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()) 
        {
            File[] files = dir.listFiles();

            System.out.println("\n----Files and their sizes (in bytes)----\n");

            if (files != null && files.length > 0) 
            {
                for (File file : files) 
                {
                    if (file.isFile()) 
                    {
                        System.out.println(file.getName() + " : " + file.length() + " bytes");
                    }
                }
            } 
            else 
            {
                System.out.println("Directory is empty.");
            }
        } 
        else 
        {
            System.out.println("Invalid directory path.");
        }

        sc.close();
    }
}
