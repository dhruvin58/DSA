import java.util.HashMap;

public class NumIdenticalPairs_1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for(int i=0; i<nums.length; i++)
//        {
//            for(int j=i+1; j<nums.length; j++)
//            {
//                if(nums[i] == nums[j])
//                {
//                    count++;
//                }
//            }
//        }
//
//        return count;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                count += map.get(num);
            }

            map.put(num, map.getOrDefault(num,0) + 1);
        }

        return  count;
    }
}
