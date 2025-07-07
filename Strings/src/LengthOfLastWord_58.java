public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s  = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        s = s.strip();
        int n = s.length()-1;

        int count = 0;
        while (n >= 0)
        {
            if (s.charAt(n) != ' ')
            {
                count++;
            }
            else {
                if (count > 0)
                {
                    break;
                }
            }
            n--;
        }
        return count;
    }
}
