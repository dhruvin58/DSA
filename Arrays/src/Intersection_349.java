import java.util.Arrays;
import java.util.HashSet;

public class Intersection_349 {
    public static void main(String[] args)
    {
        int[] arr1 = {4,9,5,5};
        int[] arr2 = {9,4,9,8,4};
        int[] ans = intersection(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<>();
        for(int i: nums1)
        {
            list1.add(i);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for(int i : nums2)
        {
            if(list1.contains(i))
            {
                resultSet.add(i);
            }
        }
        
        int[] arr = new int[resultSet.size()];
        int index = 0;
        for(int i : resultSet)
        {
            arr[index++] = i;
        }

        return arr;
    }
}
