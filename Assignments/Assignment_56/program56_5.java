import java.util.*;
import java.io.*;

public class program56_5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a directory name : ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            String[] files = dir.list();

            System.out.println("\n------Files in Dirctory------\n");

            if(files != null && files.length > 0)
            {
                for(String file : files)
                {
                    System.out.println(file);
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