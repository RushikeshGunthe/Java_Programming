/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Input:   iRow = 4     iCol = 4
// Output:  1   2   3   4
//          2   3   4   5
//          3   4   5   6
//          4   5   6   7
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;


class program29_5
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
// Date:            21/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = i ; j < (iCol + i) ; j++)
            {
                System.out.print(j + "\t");
            }        
        
            System.out.println();
        }
    }
}

