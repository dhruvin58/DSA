import java.util.HashMap;
import java.util.Map;

public class NumJewelsInStones_771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();

        for (char ch : stones.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count = 0;

        for (char jewel : jewels.toCharArray())
        {
            count += map.getOrDefault(jewel,0);
        }

        return count;

    }
}
