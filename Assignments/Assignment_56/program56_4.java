import java.util.*;
import java.io.*;

public class program56_4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file name : ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        try
        {
            if(file.exists())
            {
                System.out.println("File exists allready with given file name.");
            }
            else
            {
                if(file.createNewFile())
                {
                    System.out.println("file created Succesfully.");
                }
                else
                {
                    System.out.println("File could not be created.");
                }
            }    
        }
        catch( IOException e)
        {
            System.out.println("Error while creating the file." + e);
        }

        sc.close();        
    }
} 