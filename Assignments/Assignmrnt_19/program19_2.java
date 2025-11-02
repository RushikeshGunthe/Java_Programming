class program19_2 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(40);
    }
}

class Logic
{

    ///////////////////////////////////////////////////////////////////////////////////
    /// 
    /// Function name:  DisplayGrade
    /// Input:          Integer
    /// Output:         None
    /// Discription:    Accepts a number as marks and prints the grade depends on marks.
    /// Auther:         Rushikesh Vinod Gunthe
    /// Date:           02/11/2025
    ///  
    ///////////////////////////////////////////////////////////////////////////////////
    
    void DisplayGrade(int iMarks)
    {
        if(iMarks < 1)
        {
            System.out.println("Invalid input.");
        }
        else if(iMarks > 95)
        {
            System.out.println("'O' grade");
        }
        else if(iMarks > 90)
        {
            System.out.println("'A+' grade");
        }
        else if(iMarks > 80)
        {
            System.out.println("'A' grade");
        }
        else if(iMarks > 70)
        {
            System.out.println("'B' grade");
        }
        else if(iMarks > 60)
        {
            System.out.println("'C' grade");
        }
        else if(iMarks >= 40)
        {
            System.out.println("'D' grade");
        }
        else if(iMarks < 40)
        {
            System.out.println("You are failed");
        }
    }
}