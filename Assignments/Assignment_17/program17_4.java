


public class program17_4
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}
class Logic
{

///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  findMin
/// Input:          Integer, Integer, Integer
/// Output:         None
/// Discription:    Accepts three numbers and prints the minimum number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////

    void findMin(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 < iNo2) && (iNo1 < iNo3)) 
        {
            System.out.println(iNo1 + " is minimum");
        }
        else if((iNo2 < iNo1) && (iNo2 < iNo3))
        {
            System.out.println(iNo2 + " is minimum");
        }
        else
        {
            System.out.println(iNo3 + " is minimum");
        }

    }
}
