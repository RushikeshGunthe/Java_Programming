
public class program16_3
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}
class Logic
{

    ///////////////////////////////////////////////////////////////////////////////////
    /// 
    /// Function name:  countDigits
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints factorials of it
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           01/11/2025
    ///  
    ///////////////////////////////////////////////////////////////////////////////////
    
    void findFactorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 0;

        for(iCnt = 1, iFact = 1; iCnt <= iNo; iCnt++)
        {
            iFact *= iCnt;
        }

        System.out.println("Factorial is: "+iFact);
    }
}