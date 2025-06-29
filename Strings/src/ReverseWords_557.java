public class ReverseWords_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            StringBuilder sb1 = new StringBuilder(word);

            sb.append(sb1.reverse());

            if(i != arr.length-1)
            {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
