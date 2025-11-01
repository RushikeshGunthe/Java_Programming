
public class program17_3
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}
class Logic
{

///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  findMax
/// Input:          Integer, Integer
/// Output:         None
/// Discription:    Accepts two numbers and prints the maximum number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////

    void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1 + " is maximum");
        }
        else
        {
            System.out.println(iNo2 + " is maximum");
        }

    }
}
