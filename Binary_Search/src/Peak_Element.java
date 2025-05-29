public class Peak_Element {
    public static void main(String[] args)
    {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = 1;

        while(start <= end)
        {
            int mid = start + (end - start) /2;
            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1]))
            {
                return mid;
            }
            else if((arr[mid] > arr[mid-1]) && (arr[mid] < arr[mid+1]))
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return -1;
    }
}
