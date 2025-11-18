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
        int iLength = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();

        aobj.DigitSum();

        sobj.close();

    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user and Displays summation of digits of each number
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Logic Functions of ArrayX:
//
// Function name:   DigitSum
// Discription:     Displays summation of digits of each number from the array 
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

        sobj.close();
    }

    // Method to to display summation of digits of each number from the array
    public void DigitSum() 
    {
        int i = 0, j = 0, iSum = 0, iDigit = 0, iNo = 0;
        
        System.out.println("------------------------------------");
        for (i = 0; i < iSize; i++) 
        {
            iNo = Arr[i];
            iSum = 0;
            iDigit = 0;
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;  
            }

            System.out.println(iSum);
        }

    }
}
