import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {

        int[] arr = {5,4,7,8,3,2,1,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<arr.length; i++)
        {
            int ans = findMax(arr,0,n-i-1);
            int temp = arr[ans];
            arr[ans] = arr[n-i-1];
            arr[n-i-1] = temp;

        }
    }
    static int findMax(int[] arr, int start, int end)
    {
        int maxIndex = start;
        for(int i=start; i<=end; i++)
        {
            if(arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
