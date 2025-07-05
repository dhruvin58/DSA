import java.util.Arrays;

public class ThirdMax_414 {
    public static void main(String[] args)
    {
        int[] arr ={1,2,2,5,3,5};
        System.out.println(thirdMax(arr));
    }
    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int max_count = 0;
        long max_number = Long.MIN_VALUE;
        int i=n;
        while(i>=0 && max_count< 3)
        {
            if(max_number != nums[i])
            {
                max_number = nums[i];
                max_count++;
            }
            i--;
        }
        if(max_count < 3)
        {
            return nums[n];
        }
        else
        {
            return (int)max_number;
        }
    }
}
