import java.util.Arrays;

public class MissingNumber_268 {
    public static void main(String[] args)
    {
        int[] arr = {3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != i)
            {
                return i;
            }
        }
        return nums.length;
    }
}
