import java.io.*;
import java.util.*;

public class program58_2 
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

            try 
            {
                FileWriter fw = new FileWriter("marvellous.txt");

                if (files != null && files.length > 0) 
                {
                    for (File file : files) 
                    {
                        if (file.isFile()) 
                        {    
                            // Write file name as heading
                            fw.write("----- " + file.getName() + " -----");
                            fw.write(System.lineSeparator());

                            FileReader fr = new FileReader(file);
                            
                            int ch;

                            while ((ch = fr.read()) != -1) 
                            {
                                fw.write(ch);
                            }

                            fr.close();
                            fw.write(System.lineSeparator());
                            fw.write(System.lineSeparator());
                        }
                    }
                }

                fw.close();
                System.out.println("All file data written successfully into marvellous.txt");

            } 
            catch (IOException e) 
            {
                System.out.println("Error while writing to marvellous.txt");
            }

        } 
        else 
        {
            System.out.println("Invalid directory path.");
        }

        sc.close();
    }
}
