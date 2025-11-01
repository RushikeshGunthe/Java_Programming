class program18_1 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPrime(12);
    }    
}

class Logic
{

///////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name:  checkPrime
/// Input:          Integer
/// Output:         None
/// Discription:    Accepts a number and prints that number is prime or not
/// Auther:         Rushikesh Vinod Gunthe
/// Date:           02/11/2025
///  
///////////////////////////////////////////////////////////////////////////////////
    void checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bisPrime = false;

        bisPrime = true;

        if(iNo < 2)
        {
            bisPrime = false;
        }
        else
        {
            for(iCnt = 2; iCnt <= iNo / 2; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    bisPrime = false;
                    break;
                }
            }

        }

        
        if(bisPrime == true)
        {
            System.out.println(iNo + " is a prime number");
        }
        else
        {
            System.out.println(iNo + " is not a prime number");
        }
    }
}
