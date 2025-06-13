import java.util.*;
public class ReverseVowels_345 {
    public static void main(String[] args)
    {
        String s = "leetcode";
        String ans = reverseVowels(s);
        System.out.println(ans);
    }
    static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;

        char[] str = s.toCharArray();

        while (start < end) {
            boolean startStatus = isVowel(str[start]);
            boolean endStatus = isVowel(str[end]);

            if (!startStatus)
            {
                start++;
            }
            else if(!endStatus)
            {
                end--;
            }
            else
            {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        String newStr = new String(str);
        return newStr;
    }
    static boolean isVowel(char s)
    {
        if(s == 'a' || s == 'A' ||s == 'E' ||s == 'e' ||s == 'I' ||s == 'i' ||s == 'O' ||s == 'o' ||s == 'u' ||s == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
