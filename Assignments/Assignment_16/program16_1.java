class Logic
{
    void calculateSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum += iCnt;
        }

        System.out.println("Sum of first natural numbers till " + iNo + " is: " + iSum);
    }
}

public class program16_1
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}