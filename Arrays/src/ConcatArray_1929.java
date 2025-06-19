import java.util.Arrays;

public class ConcatArray_1929 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,1};
        int[] ans = new int[arr.length*2];
        ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int k=0;
        for(int i=0; i<nums.length; i++)
        {
            ans[k] = nums[i];
            k++;
        }
        for(int i=0; i<nums.length; i++)
        {
            ans[k] = nums[i];
            k++;
        }
        return ans;
    }
}
