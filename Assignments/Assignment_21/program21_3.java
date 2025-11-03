class program21_3
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.DisplayFactors(12);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  DisplayFactors
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints all factors of that number.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        System.out.println("Factors of "+ iNo +" :");
        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }

    }
}