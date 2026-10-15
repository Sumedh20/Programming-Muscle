package Basics.Important;

public class SecondLargest
{
    public static void main(String[] a)
    {
//        int []array = {10,5,6,16,15};
        int []array = {10,10,10,10,10};
       int sLarge =  findSecondLargest(array);
        System.out.println((sLarge==-1)?"No second largest":"Second Largest "+sLarge);
    }

    private static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;

        //edge cases
        if(array.length==1)
        {
            return -1;
        }

        for(int i = 0 ; i<= array.length-1 ; i++)
        {
            if(array[i]>largest)
            {
                sLarge = largest;
                largest  = array[i];
            }
           else
            {
                if(array[i]>sLarge && array[i]<largest)
                {
                    sLarge = array[i];
                }

            }
        }
//        System.out.println("The second largest element is :"+sLarge);
        return (sLarge==Integer.MIN_VALUE)?-1:sLarge;
    }
}
