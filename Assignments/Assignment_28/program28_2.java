/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Input:   iRow = 4     iCol = 4
// Output:  A   B   C   D
//          a   b   c   d
//          A   B   C   D
//          a   b   c   d
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;


class program28_2
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
        char cCap = '\0', cSmall = '\0';
        
        if((iCol >= 1) && (iCol <= 26))
        {
            for(i = 1; i <= iRow; i++)
            {
                cCap = 'A';
                cSmall = 'a';
        
                for(j = 1; j <= iCol; j++)
                {
                    if(i % 2 != 0)
                    {
                        System.out.print(cCap + "\t");
                        cCap++;
                    }
                    else
                    {
                        System.out.print(cSmall + "\t");
                        cSmall++;
                    }
                }
                System.out.println();
            }
            
        }
        else
        {
            System.out.println("number of colunms should be in range of 1 to 26");
        }
        
    }
}
