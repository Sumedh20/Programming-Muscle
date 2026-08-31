package Basics.Important;

public class NumDigitEqual
{
    public static void main(String[] a)
    {
        System.out.println("Checking number of digits = sum of digit");
        int num = 20102;

        checkDigit(num);
    }

    private static void checkDigit(int num) {
        int sum = 0 ;
        int count=0;
        while(num>0)
        {
            sum+= num%10;
            num/=10;
            count++;

        }
        if(sum == count)
        {
            System.out.println("The digit length is "+count+" and sum is "+sum);
            System.out.println("Its a autobiographical Number");
        }
    }
}
