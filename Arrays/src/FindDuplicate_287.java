public class FindDuplicate_287 {
    public static void main(String[] args)
    {
        int[] arr ={1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    static  int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

/*
dry run this code with this array nums = [2, 5, 9, 6, 9, 3, 8, 9, 7, 1] and you will get understanding of the algoritham
 */