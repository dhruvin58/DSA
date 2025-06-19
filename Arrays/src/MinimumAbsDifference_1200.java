import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference_1200 {
    public static void main(String[] args)
    {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> matrix = new ArrayList<>();
        matrix = minimumAbsDifference(arr);
        System.out.println("After adding new row: " + matrix);

    }
    static public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> matrix = new ArrayList<>();
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++)
        {
            mindiff = Math.min(mindiff, (Math.abs(arr[i] - arr[i-1])));
        }
        for(int i=1; i<arr.length; i++)
        {
            if((arr[i] - arr[i-1]) == mindiff)
            {
                List<Integer> row = new ArrayList<>();
                row.add(arr[i-1]);
                row.add(arr[i]);
                matrix.add(row);
            }
        }
        return matrix;
    }
}

