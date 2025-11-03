class program19_3 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}

class Logic {

    ///////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name: CheckDivisible
    /// Input: Integer
    /// Output: None
    /// Discription: Accepts a number checks if the number is divisible by 5 and 11.
    /// Auther: Rushikesh Vinod Gunthe
    /// Date: 02/11/2025
    ///
    ///////////////////////////////////////////////////////////////////////////////////

    void CheckDivisible(int iNo) 
    {
        if ((iNo % 5 == 0) && (iNo % 11 == 0)) {
            System.out.println(iNo + " is divisible by 5 and 11.");
        } else {
            System.out.println(iNo + " is not divisible by 5 and 11.");
        }
    }
}