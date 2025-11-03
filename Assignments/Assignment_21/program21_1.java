class program21_1 
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.ProductOfDigits(234);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  ProductOfDigits
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints product of its digits.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void ProductOfDigits(int iNo)
    {
        int iOriginal = iNo;
        int iDigit = 0;
        int iMult = 1;

        if(iNo < 0)         //Updater to handle negative value
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iMult *= iDigit;
            iNo = iNo / 10;
        }

        System.out.println("Product of digits in given number "+ iOriginal + " is: " + iMult);
    }
}