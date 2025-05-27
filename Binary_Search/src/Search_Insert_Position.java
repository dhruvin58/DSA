public class Search_Insert_Position {
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(arr, target);
        System.out.println("insertion position is : " + ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            int mid = start + (end-start) /2;
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return start;

    }
}
