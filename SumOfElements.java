package Basics.Important;

public class SumOfElements
{
    public static int sumOfELements(int[] a)
    {
        int sum = 0;
        for(int num : a)
        {
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] arr = {20,1,15,28,3};
        int sum = sumOfELements(arr);
        System.out.println("Sum of elements:"+sum);
    }
}
