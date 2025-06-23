public class TruncateSentence_1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k=4;
        System.out.println(truncateSentence(s,k));
    }
    static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<k-1; i++)
        {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[k-1]);

        return sb.toString();

    }
}
