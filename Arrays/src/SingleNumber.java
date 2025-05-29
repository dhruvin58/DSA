import java.util.Arrays;
public class SingleNumber {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,4,5,3,4,1};
        int ans = singleNumber(arr);
        System.out.println(ans);

    }

    private static int singleNumber(int[] arr) {
        int ans = -1;
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i = i+2)
        {
            if(arr[i] != arr[i+1])
            {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
