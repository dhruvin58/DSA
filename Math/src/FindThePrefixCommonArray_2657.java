import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThePrefixCommonArray_2657 {
    public static void main(String[] args) {
        int[] A = {2,3,1};
        int[] B = {3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A,B)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[B.length];
        List<Integer> AList = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {
            int count = 0;
            for (int j = i; j >= 0; j--) {

                if (!AList.contains(A[i]))
                {
                    AList.add(A[i]);
                }

                if (AList.contains(B[j]))
                {
                    count += 1;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
