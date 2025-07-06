import java.util.Arrays;

public class BuildArray_1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++)
        {
            result[k++] = nums[nums[i]];
        }
        return result;
    }
}
