public class Implimentation {
    public static void main(String[] args)
    {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if (target == arr[mid])
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
