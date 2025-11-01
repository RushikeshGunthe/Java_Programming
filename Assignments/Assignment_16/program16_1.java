class Logic
{

    ///////////////////////////////////////////////////////////////////////////////////
    /// 
    /// Function name:  countDigits
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints addition from 1 to given number
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           01/11/2025
    ///  
    ///////////////////////////////////////////////////////////////////////////////////
    
    void calculateSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum += iCnt;
        }

        System.out.println("Sum of first natural numbers till " + iNo + " is: " + iSum);
    }
}

public class program16_1
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}