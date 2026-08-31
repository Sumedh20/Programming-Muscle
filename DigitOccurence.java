package Basics.Important;

public class DigitOccurence
{
    public static void main(String[] args) {
        System.out.println("Printing the count for each number");
        int[] nums = {1,5,3,6,5,2,6,9,7};
        digitCount(nums);
    }

    private static void digitCount(int[] nums) {
        int[] freq = new int[10];
        for(int val : nums)
        {
            freq[val]++;
        }
        //Printing the occurences
        for(int i = 0 ; i<freq.length ; i++)
        {
            System.out.println("The "+i+" "+"occurs"+freq[i]+" times");
        }
    }
}
