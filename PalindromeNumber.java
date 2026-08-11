package Basics.Important;

public class PalindromeNumber {
    public static void main(String[] a)
    {
        int number = 121;
        System.out.println("Checking whether the number is palindrome or not");
       boolean palindrome = checkPalindrome(number);
        System.out.println((palindrome)?"Its a palindrome":"Not a palindrome");
    }
    private static boolean checkPalindrome(int num)
    {
        //Check for base case
        int rev = 0;
        if(num== 0)
            return false;
        while(num>0)
        {
            int last = num % 10;
            rev = (rev*10) + last;
            num/=10;
        }
        return true;
    }
}
