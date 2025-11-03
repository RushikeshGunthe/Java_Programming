class program20_4
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.FindSmallestDigit(45872);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  FindSmallestDigit
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints the the smallest digit in given number.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void FindSmallestDigit(int iNo)
    {
        
        if(iNo < 0)         //Updater to handle negative value
        {
            iNo = -iNo;
        }
        
        int iDigit = 0;
        int iSmallDigit = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit < iSmallDigit)
            {
                iSmallDigit = iDigit;
            }
            iNo = iNo / 10;
        }

        System.out.println("The Smallest digit in given number is: "+ iSmallDigit);
    }
}