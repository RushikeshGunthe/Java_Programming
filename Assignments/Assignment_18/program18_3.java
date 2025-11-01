class program18_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }    
}

class Logic
{
///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  printOddNumbers
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints all odd numbers upto given number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////
    void printOddNumbers(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt +=2)
        {
            System.out.println(iCnt);
        }
    }
}
