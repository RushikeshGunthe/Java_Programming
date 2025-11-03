class program20_1 
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.SumEvenNumbers(10);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  CalculatePower
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints sum of all even numbers upto given number.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void SumEvenNumbers(int iNo)
    {
        int iCnt = 0;
        int iSumEven = 0;

        if(iNo < 0)         //Updater to handle negative value
        {
            iNo = -iNo;
        }

        for(iCnt = 2; iCnt <= iNo; iCnt += 2)
        {
            System.out.println(iCnt);
            iSumEven += iCnt;
        }

        System.out.println("Sum of even digits in range 1 to "+ iNo + " is: " + iSumEven);
    }
}