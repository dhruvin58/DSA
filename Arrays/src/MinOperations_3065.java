import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperations_3065 {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(nums,k));
    }
    public static int minOperations(int[] nums, int k) {
        int count = 0;
        List<Integer> numsList = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        int minNumber = numsList.stream().min(Integer::compareTo).orElse(0);

        while (minNumber <= k)
        {
            minNumber = numsList.stream().min(Integer::compareTo).orElse(0);
            if (minNumber < k)
            {
                int index = numsList.indexOf(minNumber);
                numsList.remove(index);
                count++;
            }
            else{
                break;
            }
        }
        return count;


    }
}
