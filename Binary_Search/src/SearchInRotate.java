public class SearchInRotate {
    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2,3};
        int ans = search(arr,0);
        System.out.println(ans);
    }
    static int search(int[] nums, int target)
    {
        int pivot = findPivot(nums);
        if(pivot == -1)
        {
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target)
        {
            return pivot;
        }
        else if(nums[0] <= target)
        {
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int BinarySearch(int[] arr, int target, int start, int end)
    {
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
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end-start) /2;
            if(end > mid && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start] >= arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
