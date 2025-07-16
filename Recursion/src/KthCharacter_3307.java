public class KthCharacter_3307 {
    public static void main(String[] args) {
       int k = 10;
       int[] operations = {0,1,0,1};
        System.out.println(kthCharacter(k,operations));
    }
    static char kthCharacter(long k, int[] operations) {
        return helper(new StringBuilder("a"), (int) k,operations);
    }
    static char helper(StringBuilder word, int k, int[] operations)
    {
        int i=0;
        while(i < operations.length)
        {
            StringBuilder sb = new StringBuilder();
            if (operations[i] == 0)
            {
                sb = new StringBuilder(word);
            }
            else
            {
                for (int j=0; j<word.length(); j++)
                {
                    if (word.charAt(j) == 'z')
                    {
                        sb.append('a');
                    }
                    else {
                        sb.append((char)(word.charAt(j)+1));
                    }
                }
            }
            word.append(sb);
            i++;
        }

        return word.charAt(k-1);
    }
}
// not optimized..;