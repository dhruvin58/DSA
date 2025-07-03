public class KthCharacter_3304 {
    public static void main(String[] args) {
        int k = 5;
        System.out.println(kthCharacter((k)));
    }
    static char kthCharacter(int k) {
//        StringBuilder word = new StringBuilder("a");
//        while(word.length() < k)
//        {
//            StringBuilder sb = new StringBuilder();
//            for (int i=0; i<word.length(); i++)
//            {
//                if (word.charAt(i) == 'z')
//                {
//                    sb.append('a');
//                }
//                else {
//                    sb.append((char)(word.charAt(i)+1));
//                }
//            }
//            word.append(sb);
//
//        }
//
//        return word.charAt(k - 1);

        return helper(new StringBuilder("a"), k);
    }
    static char helper(StringBuilder word, int k)
    {
        if (word.length() > k)
        {
            return word.charAt(k-1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<word.length(); i++)
        {
            if (word.charAt(i) == 'z')
                {
                    sb.append('a');
                }
                else {
                    sb.append((char)(word.charAt(i)+1));
                }
        }
        word.append(sb);

        return  helper(word,k);

    }
}
