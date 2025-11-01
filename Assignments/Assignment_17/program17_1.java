
public class program17_1
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(7865);
    }
}

class Logic
{

///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  sumOfDigits
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints sum of digits in that number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           01/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////
    
    void sumOfDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while (iNo != 0) 
        {
            iDigit = iNo % 10;   //Contains last digit
            iSum += iDigit;
            iNo = iNo / 10;        // Remove last digit
        }

        System.out.println("Sum of digits in given number: "+ iSum);
    }
}