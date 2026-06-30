import java.util.HashSet;

public class UniqueMorseRepresentations_804 {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] resultArray = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char ch : words[i].toCharArray())
            {
                int index = ch - 'a';
                stringBuilder.append(morseCodes[index]);
            }
            resultArray[i] = stringBuilder.toString();
        }

        HashSet<String> set = new HashSet<>();

        for (String codes : resultArray)
        {
            set.add(codes);
        }

        return set.size();



    }
}
