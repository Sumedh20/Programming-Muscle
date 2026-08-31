package Basics.Important;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        //Printing fibonacci number series
        int number = 5;
        int first =1 ;
        int second = 1;
        System.out.print(first+" "+second+" ");
        int third = 0;
        int i =0;
        while(i < number)
        {
            third = first + second;
            if(third>number)
                break;
            System.out.print(third+" ");
            first = second;
            second = third;
            i++;
        }
    }
}
