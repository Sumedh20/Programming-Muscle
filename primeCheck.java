package Basics.Important;
import java.util.*;

public class primeCheck {
    public static void main(String[] a)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Program to check whether the number is prime or not");
        System.out.println("Enter the number to check");
        int number = s.nextInt();

        bruteForce(number);
        optimal(number);

    }

    private static void bruteForce(int number) {
        boolean prime = true;
        System.out.println("The brute force approach");
        if(number == 0 || number == 1)
            prime = false;
        for(int i = 2 ; i<number ; i++)
        {
            if(number % i == 0)
            {
                System.out.println("The number : "+number + " is Not a prime");
                prime = false;
                break;
            }

        }
        if(prime)
        {
            System.out.println("Prime One");
        }
        if(!prime)
        {
            System.out.println("nor prime nor composite");
        }
    }

    private static void optimal(int number) {
        System.out.println("The optimal approach");
        boolean prime = true;
        if(number == 0 || number == 1)
        {
            prime = false;
            System.out.println("Not prime not composite");

        }
        for(int i = 2 ; i<Math.sqrt(number) ; i++)
        {
            if(number % i == 0)
            {
                prime = false;
                System.out.println("Not a prime");
                break;
            }
        }
        if(prime)
        {
            System.out.println("number: "+number+" is Prime");
        }

    }
}
