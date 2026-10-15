package Basics.Important;

public class MoveAllZeros
{
    public static void main(String[] a)
    {
        int[] arr ={10,0,5,6,0,0,7};
        shift(arr);

    }

    private static void shift(int[] arr) {

        int current = 0 ;
        for(int i = 0 ; i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
                current++;
            }
        }

        for(int nums : arr)
        {
            System.out.println(nums);
        }
    }

}
