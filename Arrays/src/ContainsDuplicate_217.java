import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0; i<nums.length-1; i++)
//        {
//            if(nums[i] == nums[i+1])
//            {
//                return true;
//            }
//        }
//        return false;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            else
            {
                set.add(num);
            }
        }
        return false;
    }
}
