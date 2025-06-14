public class MaxNumberOfWords_2114 {
    public static void main(String[] args)
    {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = mostWordsFound(sentences);
        System.out.println(ans);
    }
    static int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(int i=0; i<sentences.length; i++)
        {
            maxLength = Math.max(maxLength, sentences[i].split(" ").length);
        }
        return maxLength;
    }
}
