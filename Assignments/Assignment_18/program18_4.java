class program18_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }    
}

class Logic
{
///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  SumEvenOddDigits
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints sum of even and odd digits seperately of that number
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////
    void SumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iSumeven = 0;
        int iSumOdd = 0;

        while( iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSumeven += iDigit; 
            }
            else
            {
                iSumOdd += iDigit;
            }
            iNo = iNo / 10;
        }

        System.out.println("Sum of even digits in number is: "+ iSumeven);
        System.out.println("Sum of odd digits in number is: "+ iSumOdd);
    }
}
