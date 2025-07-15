public class ValidWord_3136 {
    public static void main(String[] args) {
        String word = "234Aa";
        System.out.println(isValid(word));
    }
    static boolean isValid(String word) {
        if (word.length() < 3)
        {
            return false;
        }
        for (char ch : word.toCharArray())
        {
            if (ch == '@' || ch == '#' || ch == '$')
            {
                return false;
            }
        }

        int vowel_count = 0;
        int consonant_count = 0;
        for (char ch : word.toCharArray())
        {
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'
            || ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
            {
                vowel_count++;
            }
            else if (Character.isLetter(ch))
            {
                consonant_count++;
            }
        }

        if (vowel_count < 1 || consonant_count < 1)
        {
            return false;
        }
        return true;
    }
}
