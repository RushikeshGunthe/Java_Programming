/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program23_2 {

    public static void main(String args[]) 
    {
        int iSize = 0,iRet = 0, iValue = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        System.out.println("Enter number to to check presence:");
        iValue = sobj.nextInt();

        iRet = aobj.FirstOccurence(iValue);
        if(iRet < iSize)
        {
            System.out.println("First occurence of " + iValue + " at index "+ iRet);
        }
        else
        {
            System.out.println( iValue + " is not present in array");
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
// Function name:   FirstOccurence
// Discription:     Accepts an number as iNo and returns its first occurence if number is present in the array
// Input:           Integer
// Output:          Integer
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
    public int FirstOccurence(int iNo) 
    {
        int iCnt = 0;
        
        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            if(iNo == Arr[iCnt])
            {
                break;
            }
        }

        return iCnt;
        
    }

}
