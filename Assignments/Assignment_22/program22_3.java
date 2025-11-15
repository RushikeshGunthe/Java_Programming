/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program22_3 
{

    public static void main(String args[]) 
    {
        int iSize = 0; 
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        bRet = aobj.Check();
        if(bRet == true)
        {
            System.out.println("11 is present in the array.");
        }
        else
        {
            System.out.println("11 is not present in the array.");
        }


    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user and check if 11 is present in the array or not present
// Input:           Integer
// Output:          Boolean
// Author:          Rushikesh Vinod Gunthe
// Date:            15/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX 
{

    private int Arr[];
    private int iSize;

    // Constructor for allocating resources
    public ArrayX(int iNo) 
    {
        iSize = iNo;            //Size of array
        Arr = new int[iSize];   //Dynamic memory allocation of array
    }

    //Method to accept elements of array (Getter)
    public void Accept() 
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Elements of Array:");

        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    // Method to check if 11 is present in the array or not
    public boolean Check() 
    {
        int iCnt = 0;
        boolean bFlag = false;

        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            if(11 == Arr[iCnt])
            {
                bFlag = true;
                break;
            }
        }
        
        return bFlag;
    }

}
