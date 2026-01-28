import java.io.*;
import java.util.*;

public class program56_3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String fileName = sc.nextLine();

        File file = new File(fileName); 

        if(file.exists())
        {
            try
            {
                FileWriter fw = new FileWriter(file,true);

                System.out.println("Write some data in file");

                String data = sc.nextLine();

                fw.write(data);
                fw.write(System.lineSeparator());
                fw.close();

                System.out.println("Data written succesfully at the end of file.");
            }
            catch(IOException e)
            {
                System.out.println("Data not written succesfully at the end of file. Error : " + e);
            }
        }
        else
        {
            System.out.println("File does not exist.");
        }

        sc.close();
    }
}
