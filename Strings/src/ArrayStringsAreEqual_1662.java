public class ArrayStringsAreEqual_1662 {
    public static void main(String[] args)
    {
        String word1[] = {"ab", "c"};
        String word2[] = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i=0;
        int word1_length = word1.length;

        while(i<word1_length)
        {
            sb1.append(word1[i]);
            i++;
        }

        int j=0;
        int word2_length = word2.length;

        while(j<word2_length)
        {
            sb2.append(word2[j]);
            j++;
        }

        return sb1.toString().equals(sb2.toString());
    }
}
