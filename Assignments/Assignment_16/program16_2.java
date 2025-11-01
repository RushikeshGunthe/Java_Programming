
public class program16_2
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
class Logic
{

    ///////////////////////////////////////////////////////////////////////////////////
    /// 
    /// Function name:  countDigits
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints the number is even or odd
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           01/11/2025
    ///  
    ///////////////////////////////////////////////////////////////////////////////////
    
    void checkEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }

        
    }
}