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

        System.out.println("Difference of sum of even and odd elements is: "+ iRet);

        sobj.close();

    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user and returns difference between sum of even and odd elements from the array
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Logic Functions of ArrayX:
//
// Function name:   Difference
// Discription:     Calculate difference between sum of even and odd elements from the array and returns it 
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

        sobj.close();
    }

    // Method to Calculate difference between sum of even and odd elements from the array
    public int Difference() 
    {
        int i = 0, iSumEven = 0, iSumOdd = 0;
        
        System.out.println("------------------------------------");
        for (i = 0; i < iSize; i++) 
        {
           if(Arr[i] % 2 == 0)
           {
                iSumEven += Arr[i];
           }
           else
           {
                iSumOdd += Arr[i];
           }
        }

        return (iSumEven - iSumOdd);

    }
}
