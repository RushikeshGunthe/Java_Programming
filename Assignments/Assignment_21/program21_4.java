class program21_4
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.CountFactors(12);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  CountFactors
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints count of its factors.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void CountFactors(int iNo)
    {
        int iCnt = 0;
        int iFactCnt = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactCnt++;
            }
        }

        System.out.println("Count of factors of "+ iNo +" is: " + iFactCnt);
    }
}