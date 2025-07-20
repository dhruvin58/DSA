import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        MergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void MergeSort(int[] arr, int start, int end)
    {
        if (end - start <= 1)
        {
            return;
        }

        int mid = (start + end) / 2;

        MergeSort(arr,start,mid);
        MergeSort(arr,mid,end);

        mergeArray(arr,start,mid,end);
    }

    static void mergeArray(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j=mid;
        int k=0;

        while (i < mid && j < end)
        {
            if (arr[i] < arr[j])
            {
                mix[k++] = arr[i++];
            }
            else
            {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid)
        {
            mix[k++] = arr[i++];
        }

        while (j < end)
        {
            mix[k++] = arr[j++];
        }

        for (int l=0; l<mix.length; l++)
        {
            arr[l+start] = mix[l];
        }
    }
}
