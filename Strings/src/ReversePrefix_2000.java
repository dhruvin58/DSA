public class ReversePrefix_2000 {
    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'z';
        System.out.println(reversePrefix(word,ch));
    }
    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if(index == -1)
        {
            return word;
        }
        StringBuilder sb = new StringBuilder();

        for (int i=index; i>=0; i--)
        {
            sb.append(word.charAt(i));
        }
        for (int i=index+1; i<word.length(); i++)
        {
            sb.append(word.charAt(i));
        }

        return sb.toString();

    }
}
