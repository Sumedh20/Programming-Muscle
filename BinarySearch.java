package Basics.Important;

public class BinarySearch
{
    public static void main(String []a)
    {
        int[] arr= {2,5,15,20,32};
//        int key = 10;
        int key = 15;
        System.out.println("Implementing Binary Search");

        int index = binarySearch(arr, key, 0,arr.length);
        if(index==-1)
            System.out.println("Element not found!");
        else
            System.out.println("Found at index :"+index);
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid]>key)
                return binarySearch(arr,key,start,mid-1);
            if(arr[mid]<key)
                return binarySearch(arr,key,mid+1,end);
        }
        return -1;

    }
}
