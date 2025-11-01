
public class program16_2
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
class Logic
{
    void checkEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }

        
    }
}