package Basics.Important;
import java.util.*;
public class Prime2_Print
{
    public static void main(String []a)
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int count = 0;
        System.out.println("Printing numbers upto :"+number );
        for(int i = 2; i<number ; i++)
        {
            boolean prime = checkPrime(i);
            if(prime)
            {
                System.out.print(i+" ");
            }
        }
    }
    private static boolean checkPrime(int num) {
        boolean prime = true;
        for(int i = 2 ; i<=Math.sqrt(num) ; i++)
        {
            if(num % i == 0){
                prime = false;
            }
        }
        if(prime)
        {
            return prime;
        }

        return prime;
    }
}
