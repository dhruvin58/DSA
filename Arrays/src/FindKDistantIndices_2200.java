import java.util.*;

public class FindKDistantIndices_2200 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int key = 2;
        int k =2;
        System.out.println(findKDistantIndices(nums,key,k));
    }
    static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//        Brute- Force Approach....


//        List<Integer> list = new ArrayList<>();
//
//        List<Integer> keyIndex_list = new ArrayList<>();
//
//        for(int i=0; i<nums.length; i++)
//        {
//            if(nums[i] == key)
//            {
//                keyIndex_list.add(i);
//            }
//        }
//
//        for (int i=0; i<keyIndex_list.size(); i++)
//        {
//            int index = keyIndex_list.get(i);
//
//            for(int j=0; j<nums.length; j++)
//            {
//                if(Math.abs(j-index) <= k && nums[index] == key)
//                {
//                    if (!list.contains(j))
//                    {
//                        list.add(j);
//                    }
//                }
//            }
//        }
//
//        return list;


//        Optimal Solution..

        Set<Integer> set = new HashSet<>();

        int n = nums.length-1;
        for (int i=0; i<=n; i++)
        {
            if(nums[i] == key)
            {
                int start = Math.max(0,i-k);
                int end = Math.min(n, i+k);

                for (int j=start; j<= end; j++)
                {
                    set.add(j);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}
