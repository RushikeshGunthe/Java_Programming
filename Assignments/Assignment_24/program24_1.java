/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program24_1
{

    public static void main(String args[]) 
    {
        int iSize = 0, iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        iRet = aobj.Maximum();

        System.out.println("Maximum of all elements in array is: " + iRet);
        
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
// Function name:   Maximum
// Discription:     Finds the maximum number from the array and returns it
// Input:           Integer
// Output:          Integer
//
// Author:          Rushikesh Vinod Gunthe
// Date:            18/11/2025
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

    // Method to to return Maximum of all elements in the array
    public int Maximum() 
    {
        int iCnt = 0, iMax = 0;

        for (iCnt = 0, iMax = Arr[0]; iCnt < iSize; iCnt++) 
        {
            if (Arr[iCnt] > iMax )
            {
                iMax = Arr[iCnt];
            }
        }

        return iMax;
        
    }

}
