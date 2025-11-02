public class program19_1 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}

class Logic
{

    ///////////////////////////////////////////////////////////////////////////////////
    /// 
    /// Function name:  CheckLeapYear
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number as year and prints if the year is a leap year or not.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           02/11/2025
    ///  
    ///////////////////////////////////////////////////////////////////////////////////
    
    void CheckLeapYear(int iYear)
    {
        if ((iYear % 4 == 0 && iYear % 100 != 0) || (iYear % 400 == 0)) 
        {
            System.out.println(iYear + " is a leap year.");
        } else {
            System.out.println(iYear + " is not a leap year.");
        }
    }
}