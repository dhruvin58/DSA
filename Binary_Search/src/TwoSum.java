import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] arr = {0,0,3,4};
        int[] ans = twoSum(arr,0);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] arr = new int[2];

        while(start < end)
        {   int total = numbers[start] + numbers[end];
            if(total == target)
            {
                arr[0] = start+1;
                arr[1] = end+1;
                break;
            }
            else if(total > target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return arr;
    }
}
