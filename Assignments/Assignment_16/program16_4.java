
public class program16_4
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}
class Logic
{

    ///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  countDigits
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints number in reverse
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           01/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////

    void reverseNumber(int iNo)
    {
        int iReversed = 0;
        int iDigit = 0;
        
        while (iNo != 0) 
        {
            iDigit = iNo % 10;    // Get the last digit
            iReversed = iReversed * 10 + iDigit; // Build the reversed number
            iNo = iNo / 10;       // Remove last digit
        }

        System.out.println("Reversed number is: "+ iReversed);
    }
}