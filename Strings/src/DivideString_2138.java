import java.util.Arrays;

public class DivideString_2138 {
    public static void main(String[] args)
    {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] arr = divideString(s,k,fill);
        System.out.println(Arrays.toString(arr));
    }
    static String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        int size = s.length();
        while(size % k != 0)
        {
            sb.append(fill);
            size++;
        }

        String newString = sb.toString();
        int arrSize = newString.length()/k;
        String[] arr = new String[arrSize];
        int l=0;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = "";
            for(int j=0; j<k; j++)
            {
                arr[i] += newString.charAt(l);
                l++;
            }
        }

        return arr;
    }
}
