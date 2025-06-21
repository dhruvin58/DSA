public class PrefixCount_2185 {
    public static void main(String[] args)
    {
        String[] arr = {"leetcode","win","loops","success"};
        String pref = "code";
        System.out.println(prefixCount(arr,pref));
    }
    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<words.length; i++)
        {
            if(words[i].startsWith(pref))
            {
                count++;
            }
        }
        return count;
    }
}
