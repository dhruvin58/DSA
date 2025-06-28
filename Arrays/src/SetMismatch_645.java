import java.util.Arrays;

public class SetMismatch_645 {
    public static void main(String[] args)
    {
        int[] arr ={1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i=0;
        int n = nums.length;

        while(i < n)
        {
            int correct = nums[i] -1;
            if(nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for(int j=0; j<n; j++)
        {
            if(nums[j] != j+1)
            {
                arr[0] = nums[j];
                arr[1] = j+1;

            }
        }
        return arr;
    }

}
