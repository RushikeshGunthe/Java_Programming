


public class program17_5
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}
class Logic
{

///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  printTable
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints the table of that number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////

    void printTable(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo * iCnt);
        }        
    }
}
