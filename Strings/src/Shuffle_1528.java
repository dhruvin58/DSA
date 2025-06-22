public class Shuffle_1528 {
    public static void main(String[] args)
    {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        int length = s.length();
        char[] arr = new char[length];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<length; i++)
        {
            arr[indices[i]] = s.charAt(i);
        }

        for(char c : arr)
        {
            sb.append(c);
        }

        return sb.toString();

    }
}
