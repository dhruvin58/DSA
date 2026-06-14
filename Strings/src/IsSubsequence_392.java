public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    static boolean isSubsequence(String s, String t)
    {
        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // move in s only if matched
            }
            j++; // always move in t
        }
        return i == s.length();
    }
}
