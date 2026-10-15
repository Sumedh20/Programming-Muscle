package Basics.Important;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOpti
{
    public static void main(String []as)
    {
        int[] arr = {8,5,6,1,2,9};

       int[] indexes = findIndex(arr,10);
        System.out.println("The indexes are :"+indexes[0]+" "+indexes[1]);
    }

    private static int[] findIndex(int[] arr, int target) {

        Map<Integer,Integer> hashmap = new HashMap<>();
        int remaining = 0 ;
        for(int i = 0 ; i< arr.length ; i++)
        {
            remaining = target - arr[i];
            if(hashmap.containsKey(remaining))
            {
                return new int[]{hashmap.get(remaining),i};
            }
            else
            {
                hashmap.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
