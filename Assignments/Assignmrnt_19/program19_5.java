class program19_5 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.CalculatePower(2, 5);
    }
}

class Logic {

    ///////////////////////////////////////////////////////////////////////////////////
    ///
    /// Function name: CalculatePower
    /// Input: Integer, Integer
    /// Output: None
    /// Discription: Accepts a number and prints its power.
    /// Auther: Rushikesh Vinod Gunthe
    /// Date: 03/11/2025
    ///
    ///////////////////////////////////////////////////////////////////////////////////

    void CalculatePower(int iBase, int iExp) 
    {
        int iAns = 0;
        int iCnt = 0;

        iAns = 1;
        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iAns *= iBase;
        }

        System.out.println(iExp + " power of " + iBase +" is: "+ iAns);
    }
}