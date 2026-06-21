import java.util.HashSet;
import java.util.Set;

public class MaxDistinct_3760 {
    public static int maxDistinct(String s) {
        Set<Character> distinctChar = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!distinctChar.contains(s.charAt(i)))
            {
                distinctChar.add(s.charAt(i));
                count++;
            }
            else
            {
                continue;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(maxDistinct(s));
    }
}
