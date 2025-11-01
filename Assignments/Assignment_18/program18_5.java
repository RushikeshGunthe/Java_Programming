class program18_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }    
}

class Logic
{
///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  CheckSign
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints that numbers sign
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////
    void CheckSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println(iNo + " is negative");
        }
        else if(iNo == 0)
        {
            System.out.println(iNo + " is 0");
        }
        else
        {
            System.out.println(iNo + " is positive");
        }
        
    }
}
