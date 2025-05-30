import java.util.Arrays;
public class PlusOne {
    public static void main(String[] args)
    {
        int[] arr = {9};
        int[] out = plusOne(arr);
        System.out.println(Arrays.toString(out));
    }

    static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
