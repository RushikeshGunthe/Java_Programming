/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program34_1
{

    public static void main(String args[]) 
    {
        ASCIITable aobj = new ASCIITable();

        aobj.DisplayASCII();   
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ASCIITable
//
// Logic Functions of Pattern class:
//
// Function name:   DisplayASCII
// Discription:     Display on screen from 0 to 255 full ASCII table 
// Input:           None
// Output:          None
//
// Author:          Rushikesh Vinod Gunthe
// Date:            25/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ASCIITable 
{
    public void DisplayASCII()
    {
        System.out.printf("%-10s %-10s %-15s %-10s%n", "DECIMAL", "CHAR", "HEXADECIMAL", "OCTAL");

        System.out.println("-----------------------------------------------------");

        for(int i = 0; i <= 255; i++)
        {
            char ch = (char)i;

            String displayChar;

            if(Character.isISOControl(ch))
            {
                displayChar = " ";
            }
            else
            {
                displayChar = String.valueOf(ch);
            }

            System.out.printf("%-10d %-10s %-15s %-10s%n", i, displayChar, Integer.toHexString(i).toUpperCase(), Integer.toOctalString(i));

        }
    }
}
