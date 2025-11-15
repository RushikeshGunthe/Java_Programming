/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class program22_1 
{

    public static void main(String args[]) 
    {
        int iSize = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        iRet = aobj.CountEven();
        System.out.println("Frequency of even elements in array is: "+ iRet);
    }
}


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Class name:     ArrayX
    // 
    // Discription:    Class to allocate memory dynamically of array and accepts its elements from user, displays it and returns count of even elements in array
    // Auther:         Rushikesh Vinod Gunthe
    // Date:           15/11/2025
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

    // Method to Display the elememts of array (Setter)
    public void Display() 
    {
        int iCnt = 0;

        System.out.println("Displaying Elements of Array:");

        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            System.out.println(Arr[iCnt]);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Function name:  CountEven
    // Discription:    Returns Frequency of Even Elements in the array
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int CountEven() 
    {
        int iCnt = 0, iCount = 0;

        for (iCnt = 0; iCnt < iSize; iCnt++) 
        {
            if ((Arr[iCnt] % 2) == 0) {
                iCount++;
            }
        }
        return iCount;
    }
}
