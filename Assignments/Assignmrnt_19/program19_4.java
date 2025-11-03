class program19_4 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
    }
}

class Logic {

    ///////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name: PrintDigits
    /// Input: Integer
    /// Output: None
    /// Discription: Accepts a number and prints its digits seperately.
    /// Auther: Rushikesh Vinod Gunthe
    /// Date: 03/11/2025
    ///
    ///////////////////////////////////////////////////////////////////////////////////

    void PrintDigits(int iNo) 
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}