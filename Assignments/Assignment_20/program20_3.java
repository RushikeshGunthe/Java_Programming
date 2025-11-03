class program20_3
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.CheckPerfect(6);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  CheckPerfect
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints the number is a perfect number or not.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void CheckPerfect(int iNo)
    {
        
        if(iNo < 0)         //Updater to handle negative value
        {
            iNo = -iNo;
        }
        
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum += iCnt;
            }
        }

        if(iNo == iSum)
        {
            System.out.println("The number is a perfect number");
        }
        else
        {
            System.out.println("The number is not a perfect number");
        }
    }
}