import java.util.HashMap;
import java.util.Map;

public class FindLucky_1394 {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
    static int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : arr)
        {
//            if (!map.containsKey(num))
//            {
//                map.put(num,1);
//            }
//            else
//            {
//                map.put(num,map.get(num)+1);
//            }
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int val=-1;
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            if(key == value)
                val = Math.max(key,val);
        }
        return val;
    }
}
