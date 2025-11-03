class program21_2 
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.CountEvenOddRange(50);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  CountEvenOddRange
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints count of even and odd numbers are there in range 1 to N.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void CountEvenOddRange(int iNo)
    {
        int iEvenCnt = 0;
        int iOddCnt = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iOddCnt++;
            }
        }


        System.out.println("Count of even numbers is range of 1 to " + iNo + " is: " + iEvenCnt);

        System.out.println("Count of odd numbers is range of 1 to " + iNo + " is: " + iOddCnt);
    }
}