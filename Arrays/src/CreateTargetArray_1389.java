import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            target.add(index[i],nums[i]);
        }

        int[] resultArray = new int[nums.length];
        for (int i = 0; i < target.size(); i++) {
            resultArray[i] = target.get(i);
        }
        return resultArray;
    }
}
