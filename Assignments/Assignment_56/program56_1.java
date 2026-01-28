import java.io.*;
import java.util.*;

public class program56_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name (with path): ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) 
        {
            System.out.println("File opened succesfully.");
        } 
        else 
        {
            System.out.println("File does not exist.");
        }

        sc.close();
    }
}
