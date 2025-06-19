public class MaxAdjacentDistance_3423 {
    public static void main(String[] args)
    {
        int[] arr = {0,0,0};
        int ans = maxAdjacentDistance(arr);
        System.out.println(ans);
    }
    static int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maximum = 0;

        for(int i=0; i<n-1; i++)
        {
            maximum = Math.max(maximum, Math.abs(nums[i+1] - nums[i]));
        }
        maximum = Math.max(maximum, Math.abs(nums[n-1] - nums[0]));

        return maximum;
    }
}
