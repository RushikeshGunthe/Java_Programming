/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program24_3
{

    public static void main(String args[]) 
    {
        int iLength = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();

        iRet = aobj.Difference();

        System.out.println("Difference of the Largest number and smallest number from array is: "+ iRet);
        
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user and perform som operations
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Logic Functions of ArrayX:
//
// Function name:   Difference
// Discription:     Calculates the difference between largest number and smallest number from the array and returns it
// Input:           Integer Array
// Output:          Integer
//
// Author:          Rushikesh Vinod Gunthe
// Date:            18/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX 
{
    private int iSize;
    private int Arr[];

    //Cunstructor for allocating resources
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

        System.out.println("Enter elements of array: ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    // Method to to return Difference between Largest number and Smallest number of the array
    public int Difference() 
    {
        int iCnt = 0, iMax = 0, iMin = 0;

        for (iCnt = 0, iMax = Arr[0]; iCnt < iSize; iCnt++) 
        {
            if (Arr[iCnt] > iMax )
            {
                iMax = Arr[iCnt];
            }
        }

        for (iCnt = 0, iMin = Arr[0]; iCnt < iSize; iCnt++) 
        {
            if (Arr[iCnt] < iMin )
            {
                iMin = Arr[iCnt];
            }
        }

        return (iMax - iMin);
        
    }
}
