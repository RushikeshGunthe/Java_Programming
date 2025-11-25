/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Input:   iRow = 4     iCol = 4
// Output:  *   *   *   #
//          *   *   #   *
//          *   #   *   *
//          #   *   *   *
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;


class program32_2
{

    public static void main(String args[]) 
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Rows: ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
        
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
// Date:            25/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        if(iCol == iRow)
        {
            for(i = 1; i <= iRow; i++)
            {
                for(j = 1; j <= iCol; j++)
                {

                    if(j == (iCol+1) - i)
                    {
                        System.out.print("*\t");
                    }
                    else if(j >= (iCol+1) - i)
                    {
                        System.out.print("@\t");
                    }
                    else
                    {
                        System.out.print("*\t");
                    }

                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Both number entered should be equal.");
        }
        
    }
}
