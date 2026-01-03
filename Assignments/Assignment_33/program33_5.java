/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Input:   char
// Output:  Boolean
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;


class program33_5
{

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Division: ");
        char ch = sobj.next().charAt(0);
        
        Exam pobj = new Exam();


        if(ch >= 'a' && ch <= 'z')
        {
            ch-=32;
        }

        pobj.DisplaySchedule(ch);
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class name:      Exam
//
// Logic Functions of Exam class:
//
// Function name:   DisplaySchedule
// Discription:     check input and displays schedule of exam  
// Input:           char
// Output:          None
//
// Author:          Rushikesh Vinod Gunthe
// Date:            25/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Exam 
{
    public void DisplaySchedule(char ch)
    {
        switch(ch)
        {
            case 'A':
                System.out.println("Your exam at 7 AM");
                break;
            case 'B':
                System.out.println("Your exam at 8.30 AM");
                break;
            case 'C':
                System.out.println("Your exam at 9.20 AM");
                break;
            case 'D':
                System.out.println("Your exam at 10.30 AM");
                break;
            default :
                System.out.println("Invalid Devision");

        }
        
    }
}
