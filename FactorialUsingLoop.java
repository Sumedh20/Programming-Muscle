package Basics.Important;
import java.util.*;
public class FactorialUsingLoop {
    public static void main(String[] at) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculating the factorial");
        int number = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial :"+fact);

        int ans = recFact(number);
        System.out.println("Factorial using recursion: "+ans);
    }

    private static int recFact(int number) {
        if(number ==1)
            return 1;
        return number * recFact(number-1);
    }
}
