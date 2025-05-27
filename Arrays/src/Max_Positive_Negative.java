public class Max_Positive_Negative {
    public static void main(String[] args)
    {
        int[] nums = {-3,-2,-1,0,0,1,2};
        int ans = maximumCount(nums);
        System.out.println("Maximum count from negative or positive form array is : " + ans);
    }
    public static int maximumCount(int[] nums) {
        int count_pos = 0;
        int count_neg = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > 0)
            {
                count_pos++;
            }
            else if(nums[i] < 0)
            {
                count_neg++;
            }
        }
        if(count_pos > count_neg)
        {
            return count_pos;
        }
        else
        {
            return count_neg;
        }
    }
}
