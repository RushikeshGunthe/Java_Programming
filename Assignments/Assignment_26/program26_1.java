/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Input: 5
// Output: A    B   C   D   E
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;


class program26_1
{

    public static void main(String args[]) 
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
        
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      Pattern
//
// Logic Functions of Pattern class:
//
// Function name:   Display
// Discription:     Display on screen from A to the count of number alphabet in capital 
// Input:           Integer
// Output:          None
//
// Author:          Rushikesh Vinod Gunthe
// Date:            21/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char cAlpha;
        cAlpha = 'A';
        if((iNo >= 1) && (iNo <= 26))
        {
            for(iCnt = 1; iCnt <= iNo; iCnt++)
            {
                System.out.print(cAlpha + "\t");
                cAlpha++;
            }
        }
        else
        {
            System.out.println("Number should be in range of 1 to 26(including both ends).");
        }
    }
}
