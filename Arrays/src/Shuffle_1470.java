import java.util.Arrays;

public class Shuffle_1470 {
    public static void main(String[] args) {
        int[] arr ={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int first = 0;
        int second = n;
        int k=0;
        for(int i=0; i<n; i++)
        {
            result[k++] = nums[first];
            result[k++] = nums[second];
            first++;
            second++;
        }
        return result;
    }
}
