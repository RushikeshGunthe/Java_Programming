/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program22_4 {

    public static void main(String args[]) 
    {
        int iSize = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        iRet = aobj.Frequency();
        System.out.println("Frequency of 11 is: "+ iRet);

    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user and returns count of 11 presents in the array
// Input:           Integer
// Output:          Integer
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

    // Method to return count of 11 presents in the array
    public int Frequency() 
    {
        int iCnt = 0, iCount = 0;

        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            if(11 == Arr[iCnt])
            {
                iCount++;
            }
        }

        return iCount;
        
    }

}
