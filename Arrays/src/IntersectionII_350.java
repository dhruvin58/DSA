import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionII_350 {
    public static void main(String[] args)
    {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] ans = intersect(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
//    static int[] intersect(int[] nums1, int[] nums2) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//
//        int p1 = 0;
//        int p2 = 0;
//
//        while(p1 < nums1.length && p2 < nums2.length)
//        {
//            if(nums1[p1] == nums2[p2])
//            {
//                list.add(nums1[p1]);
//                p1++;
//                p2++;
//            }
//            else if(nums1[p1] < nums2[p2])
//            {
//                p1++;
//            }
//            else
//            {
//                p2++;
//            }
//        }
//        int[] arr = new int[list.size()];
//        for(int i=0; i<list.size(); i++)
//        {
//            arr[i] = list.get(i);
//        }
//        return arr;
//    }
public static int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> result = new ArrayList<>();

    // Count frequencies of elements in nums1
    for (int num : nums1) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // Traverse nums2 and collect common elements
    for (int num : nums2) {
        if (map.containsKey(num) && map.get(num) > 0) {
            result.add(num);
            map.put(num, map.get(num) - 1); // decrease count
        }
    }

    // Convert result list to array
    int[] res = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        res[i] = result.get(i);
    }

    return res;
}
}
