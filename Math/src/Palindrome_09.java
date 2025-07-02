import java.util.*;
public class Palindrome_09 {
    public static void main(String[] args)
    {
        int num = 121;
        boolean ans = isPalindrome(num);
        System.out.println(ans);
    }
    static public boolean isPalindrome(int x) {
//        String num = String.valueOf(x);
//
//        char[] arr = num.toCharArray();
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end)
//        {
//            if(arr[start] != arr[end])
//            {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
        if(x < 0)
        {
            return false;
        }

        int reverse = 0;
        int copy = x;

        while(x > 0)
        {
            int digit = x%10;
            reverse = reverse*10 + digit;
            x = x/10;
        }

        return copy == reverse;
    }
}
