import java.util.Arrays;

public class RunningSum_1480 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
//        int k=0;
//
//        for(int i=0; i<nums.length; i++)
//        {
//            for(int j=i; j>=0; j--)
//            {
//                result[k] += nums[j];
//            }
//            k++;
//        }
        result[0] = nums[0];
        for (int i=1; i< nums.length; i++)
        {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}

