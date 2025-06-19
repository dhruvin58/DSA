import java.util.ArrayList;
import java.util.List;

public class FindDuplicates_442 {
    public static void main(String[] args)
    {
        int[] arr ={4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        list = findDuplicates(arr);
        System.out.println(list);
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

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
                list.add(nums[j]);
            }
        }
        return list;
    }
}
