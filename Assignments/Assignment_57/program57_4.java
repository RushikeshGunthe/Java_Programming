import java.util.*;
import java.io.*;
import java.security.MessageDigest;

public class program57_4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try 
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            FileInputStream fis = new FileInputStream(fileName);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) 
            {
                md.update(buffer, 0, bytesRead);
            }

            fis.close();

            byte[] checksumBytes = md.digest();

            // Convert to hex
            StringBuilder checksum = new StringBuilder();
            for (byte b : checksumBytes) 
            {
                checksum.append(String.format("%02x", b));
            }

            System.out.println("Checksum (SHA-256): " + checksum);

        } 
        catch (Exception e) 
        {
            System.out.println("Error calculating checksum.");
        }

        sc.close();
    }
}
