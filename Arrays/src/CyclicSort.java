import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args)
    {
        int[] arr = {5,4,7,8,3,2,1,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int n = arr.length;
        int i=0;
        while(i < n)
        {
            int correct = arr[i] -1;
            if(arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;
            }
        }
    }
}
