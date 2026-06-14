import java.util.HashMap;
import java.util.Map;

public class MaxFreqSum {
    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }
    public static int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> consonantMap = new HashMap<>();

        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
            {
                if (map.containsKey(ch))
                {
                    map.put(ch,(map.get(ch)+1));
                }
                else
                {
                    map.put(ch,1);
                }
            }
            else
            {
                if (consonantMap.containsKey(ch))
                {
                    consonantMap.put(ch,(consonantMap.get(ch)+1));
                }
                else
                {
                    consonantMap.put(ch,1);
                }
            }
        }

        int vowelMax = 0;
        int consonantMax = 0;

        for (int count : map.values())
        {
            if (count > vowelMax)
            {
                vowelMax = count;
            }
        }

        for (int consonantCount : consonantMap.values())
        {
            if (consonantCount > consonantMax)
            {
                consonantMax = consonantCount;
            }
        }

        return vowelMax + consonantMax;
    }
}
