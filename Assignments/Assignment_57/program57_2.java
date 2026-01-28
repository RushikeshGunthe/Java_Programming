import java.util.*;
import java.io.*;

public class program57_2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String fileName = sc.nextLine();

       File file = new File(fileName);

        if (file.exists()) 
        {
            if(file.isFile())
            {
                System.out.println("File is a regular file.");
            }
            else
            {
                System.out.println("File is not a regular file.");
            }
        }
        else
        {
            System.out.println("File does not exists.");
        }

        sc.close();
    }
}
