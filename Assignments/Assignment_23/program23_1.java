/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program23_1 
{

    public static void main(String args[]) 
    {
        int iSize = 0, iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        System.out.println("Enter number to to check presence:");
        iValue = sobj.nextInt();

        bRet = aobj.Check(iValue);
        if(bRet == true)
        {
            System.out.println(iValue +" is present in the array.");
        }
        else
        {
            System.out.println(iValue +" is not present in the array.");
        }
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Logic Functions of ArrayX:
//
// Function name:   Check
// Discription:     Accepts an number as iNo and checks if the number is present in the array or not
// Input:           Integer
// Output:          Boolean
//
// Author:          Rushikesh Vinod Gunthe
// Date:            15/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    // Method to check if given number(iNo) is present in the array
    public boolean Check(int iNo) 
    {
        int iCnt = 0;
        boolean bFlag = false;

        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            if(iNo == Arr[iCnt])
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
        
    }

}
