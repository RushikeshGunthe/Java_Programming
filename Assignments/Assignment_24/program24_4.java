/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


class program24_4
{

    public static void main(String args[]) 
    {
        int iLength = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();

        aobj.Digits();

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
// Function name:   Digits
// Discription:     Displays all 3 digits numbers from the array 
// Input:           Integer Array
// Output:          None
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

    // Method to to display all 3 digits numbers from the array
    public void Digits() 
    {
        int iCnt = 0;

        System.out.println("3 digit numbers: ");
        
        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            if ((Arr[iCnt] >= 100 && Arr[iCnt] <= 999) || (Arr[iCnt] <= -100 && Arr[iCnt] >= -999) )
            {
                System.out.println(Arr[iCnt]);
            }
        }

    }
}
