public class HalvesAreAlike_1704 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        int totalLength = s.length();
        int firstHalfLength = totalLength/2;
        int countRight = 0;
        int countLeft = 0;


        for(int i=0; i<=firstHalfLength-1; i++)
        {
            if(countVowel(s.charAt(i)))
            {
                countLeft++;
            }
        }

        for(int i=firstHalfLength; i<=totalLength-1; i++)
        {
            if(countVowel(s.charAt(i)))
            {
                countRight++;
            }
        }

        return  countRight == countLeft;
    }
    static boolean countVowel(char c)
    {
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' ||c == 'i' || c == 'o' ||c == 'u')
        {
            return  true;
        }

        return false;
    }
}
