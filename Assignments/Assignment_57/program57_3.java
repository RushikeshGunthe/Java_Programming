import java.util.*;
import java.io.*;

public class program57_3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String dirName = sc.nextLine();

       File dir = new File(dirName);

        if (!dir.exists()) 
        {
            if(dir.mkdir())
            {
                System.out.println("Directory created succesfilly.");
            }
            else
            {
                System.out.println("Failed to create the Directory.");
            }
        }
        else
        {
            System.out.println("Directory exists already.");
        }

        sc.close();
    }
}
