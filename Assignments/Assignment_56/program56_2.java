import java.io.*;
import java.util.*;

public class program56_2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name (with path): ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) 
        {
            try 
            {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                System.out.println("\n--- File Contents ---");
                while ((line = br.readLine()) != null) 
                {
                    System.out.println(line);
                }
                br.close();
            } 
            catch (IOException e) 
            {
                System.out.println("Error while opening the file.");
            }
        } 
        else 
        {
            System.out.println("File does not exist.");
        }

        sc.close();
    }
}
