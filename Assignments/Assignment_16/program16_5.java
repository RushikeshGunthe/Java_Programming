
public class program16_5
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}

class Logic
{
////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  countDigits
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number andreturns count of digits in that number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           01/11/2025
///  
////////////////////////////////////////////////////////////////////////////
    void countDigits(int iNo)
    {
        int iCnt = 0;
        
        while (iNo != 0) 
        {
            iCnt++;
            iNo = iNo / 10;       // Remove last digit
        }

        System.out.println("Count of digits in given number: "+ iCnt);
    }
}