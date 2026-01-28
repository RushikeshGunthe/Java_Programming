import java.util.*;
import java.io.*;

public class program57_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Accept source file name
        System.out.print("Enter source file name: ");
        String sourceName = sc.nextLine();

        // Accept destination file name
        System.out.print("Enter destination file name: ");
        String destName = sc.nextLine();

        File sourceFile = new File(sourceName);
        File destFile = new File(destName);

        if (!sourceFile.exists()) 
        {
            System.out.println("Source file does not exist.");
            sc.close();
            return;
        }

        try 
        {
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destFile); // creates new file

            int ch;
            while ((ch = fr.read()) != -1) 
            {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error while copying file.");
        }

        sc.close();
    }
}
