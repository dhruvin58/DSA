import java.util.Arrays;

public class FindErrorNums_645 {
    public static void main(String[] args)
    {
        int[] arr = {3,2,3,4,6,5};
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != i+1)
            {
                arr[0] = nums[i];
                arr[1] = i+1;
            }
        }
        return arr;
    }
}
