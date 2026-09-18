package Basics.Important;

public class SwapNumbers
{
    public static void main(String[] a)
    {
        int n1 = 10 ;
        int n2 = 5;

        System.out.println("original Numbers:"+n1+ " "+n2);

        swapNumbers(n1,n2);
        swapWithoutTemp(n1,n2);
        swapUsingXor(n1,n2);
        System.out.println("Using one liner : "+ (n1 = n1+n2 -(n2 = n1)) );
        System.out.println("Swapped Numbers: "+n1+" "+n2 );
    }

    private static void swapUsingXor(int n1, int n2) {
        //Swapping using xor
        n1 = n1 ^ n2; //10 5
        n2 = n1 ^ n2;//10 ^5 ^5=5
        n1 = n1^n2;// 10^5^10 =10

        System.out.println("Swapped Numbers: n1:"+n1+" n2:"+n2);
    }

    private static void swapWithoutTemp(int n1, int n2) {
        //Swapping using Arithmetic Operation
        n1 = n1+n2; //15
        n2 = n1 - n2;//10
        n1 = n1 - n2;

        System.out.println("Swapped Numbers: n1: "+n1+"   n2: "+n2);
    }

    private static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b= temp;

        System.out.println("Swapped Numbers :"+a+" "+b);
    }

}
