class program20_4
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.FindLargestDigit(83429);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  FindLargestDigit
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints the the largest digit in given number.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void FindLargestDigit(int iNo)
    {
        
        if(iNo < 0)         //Updater to handle negative value
        {
            iNo = -iNo;
        }
        
        int iDigit = 0;
        int iLargeDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iLargeDigit)
            {
                iLargeDigit = iDigit;
            }
            iNo = iNo / 10;
        }

        System.out.println("The largest digit in given number is: "+ iLargeDigit);
    }
}