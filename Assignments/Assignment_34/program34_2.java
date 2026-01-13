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
        char cRet = '\0';

        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character value: ");
        cValue = sobj.next().charAt(0);

        ASCIITable dobj = new ASCIITable();

        cRet = dobj.TogleCase(cValue);   
        System.out.println("Case toggled: "+ cRet);   

    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ASCIITable
//
// Logic Functions of Pattern class:
//
// Function name:   TogleCase
// Discription:     Toggles the case of alphabet only else remains same and return 
// Input:           Char
// Output:          Char
//
// Author:          Rushikesh Vinod Gunthe
// Date:            25/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ASCIITable 
{
    public char TogleCase(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
        {
            return (char)(ch + 32);
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            return (char)(ch - 32);
        }
        else 
        {
            return ch;
        }
    }
}
