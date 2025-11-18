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

        aobj.Display();

        sobj.close();

    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      ArrayX
// Discription:     Class to allocate memory dynamically of array and accepts its elements from user and Displays such elements which are  multiples of 11
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Logic Functions of ArrayX:
//
// Function name:   Display
// Discription:     Displays such elements which are multiples of 11
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

    // Method to Display such elements which are multiples of 11
    public void Display() 
    {
        int i = 0;
        
        System.out.println("Elements which are multiples of 11 : ");
        for (i = 0; i < iSize; i++) 
        {
           if(Arr[i] % 11 == 0)
           {
                System.out.println(Arr[i]);
           }
           
        }

    }
}
