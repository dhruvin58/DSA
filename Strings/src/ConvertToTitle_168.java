public class ConvertToTitle_168 {
    public static void main(String[] args) {
        int s = 18278 ;
        System.out.println(convertToTitle(s));
    }
    static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0)
        {
            n--;
            int rem = n%26;
            char letter = (char) (rem + 'A');
            sb.append(letter);
            n = n/26;
        }

        return sb.reverse().toString();
    }
}
