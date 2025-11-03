class program21_5
{
    public static void main(String args[])
    {
        Logic lObj = new Logic();
        lObj.PrintDivisibleBy2and3(30);
    }    
}

class Logic
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name:  PrintDivisibleBy2and3
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number and prints all numbers which are divisible by 2 and 3 in range of 1 to N.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           03/11/2025
    ///
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    void PrintDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;
        System.out.println("Following numbers are divisible by both 2 and 3:");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}