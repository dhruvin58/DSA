import java.util.Arrays;

public class ReverseString_344 {
    public static void main(String[] args)
    {
        char[] s = {};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start < end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

}
