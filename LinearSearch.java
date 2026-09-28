package Basics.Important;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] array = {10,12,15,26,2};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target :");
        int target = s.nextInt();
        int index = findTarget(array,target);
        System.out.println((index==-1)?"Not Found ":"Found at "+index);
    }

    private static int findTarget(int[] array, int target) {
        for(int i = 0 ; i< array.length; i++)
        {
            if(array[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
