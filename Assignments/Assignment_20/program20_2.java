class program20_2
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.PrintReverse(10);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  PrintReverse
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints in reverse ( from given nunber to 1).
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void PrintReverse(int iNo)
    {
        
        if(iNo < 0)         //Updater to handle negative value
        {
            iNo = -iNo;
        }
        
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}