class program18_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }    
}

class Logic
{
///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  printEvenNumbers
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints all even numbers upto given number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////
    void printEvenNumbers(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 2; iCnt <= iNo; iCnt +=2)
        {
            System.out.println(iCnt);
        }
    }
}
