package Basics.Important;

public class RotateArrayByK
{
    public static void main(String[] asd)
    {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] rotate = rotateArray(arr,k);
        System.out.println("After performing RIGHT ROTATE BY K POS");
        for(int i : rotate)
        {
            System.out.println(i);
        }
    }

    private static int[] rotateArray(int[] arr, int k) {
        int[] temp = new int[arr.length];
        int n = arr.length ;
        for(int i = 0 ; i<n ; i++)
        {
            temp[( i + k ) % n ] = arr[i];
        }
        return temp;
    }

}
//This rotates the array to right

