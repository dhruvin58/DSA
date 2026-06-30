import java.util.HashMap;
import java.util.Map;

public class SumOfUnique_1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int total = 0;
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if (entry.getValue()==1)
            {
                total += entry.getKey();
            }
        }

        return total;

    }
}