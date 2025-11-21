/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Input:   iRow = 4     iCol = 4
// Output:  A   A   A   A
//          B   B   B   B
//          C   C   C   C
//          D   D   D   D
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;


class program28_3
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
        char cCap = '\0';
        
        if((iCol >= 1) && (iCol <= 26))
        {
            cCap = 'A';
            for(i = 1; i <= iRow; i++)
            {
                for(j = 1; j <= iCol; j++)
                {
                    System.out.print(cCap + "\t");
                }
                cCap++;
                
                System.out.println();
            }
        }
            
        
        else
        {
            System.out.println("number of colunms should be in range of 1 to 26");
        }
        
    }
}
