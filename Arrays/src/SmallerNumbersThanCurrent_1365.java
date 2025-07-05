import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent_1365 {
    public static void main(String[] args) {
       int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] arr = new int[nums.length];
//        int k=0;
//
//        for (int i=0; i< nums.length; i++)
//        {
//            int count = 0;
//            for (int j=0; j< nums.length; j++)
//            {
//                if(j != i && nums[j] < nums[i])
//                {
//                    count++;
//                }
//            }
//            arr[k++]  = count;
//        }
//        return  arr;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<sorted.length; i++)
        {
            if(!map.containsKey(sorted[i]))
            {
                map.put(sorted[i],i);
            }
        }

        int[] result = new int[nums.length];
        for (int i=0; i< nums.length; i++)
        {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
