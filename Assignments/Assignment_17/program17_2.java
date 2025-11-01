
public class program17_2
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}
class Logic
{

///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  checkPalindrome
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints number is palindrome or not
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           01/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////

    void checkPalindrome(int iNo)
    {
        int iReversed = 0;
        int iDigit = 0;
        int iOriginal = iNo;
        while (iNo != 0) 
        {
            iDigit = iNo % 10;    // Get the last digit
            iReversed = iReversed * 10 + iDigit; // Build the reversed number
            iNo = iNo / 10;       // Remove last digit
        }

        if(iOriginal == iReversed)
        {
            System.out.println(iOriginal + " is palindrome");
        } 
        else
        {
            System.out.println(iOriginal + " is not palindrome");
        }
    }
        // System.out.println("Reversed number is: "+ iReversed);
}
