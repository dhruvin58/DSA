public class ValidPalindrome_125 {
    public static void main(String[] args)
    {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                sb.append(s.charAt(i));
            }
        }

        int start = 0;
        int end = sb.length()-1;

        while(start < end)
        {
            if(sb.charAt(start) != sb.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
