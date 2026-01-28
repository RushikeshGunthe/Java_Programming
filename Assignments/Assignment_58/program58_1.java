import java.util.*;
import java.io.*;
import java.security.MessageDigest;

public class program58_1
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

            System.out.println("\n----Regular Files in given directory----\n");

            if (files != null && files.length > 0) 
            {
                for (File file : files) 
                {
                    if (file.isFile()) 
                    {
                        System.out.println(file.getName());
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
