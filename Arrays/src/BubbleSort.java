import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag;
        for(int i=0; i<n; i++)
        {
            flag = false;
            for(int j=1; j<n-i; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }
}
