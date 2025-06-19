import java.util.Arrays;

public class FindRightInterval {
    public static void main(String[] args)
    {
        int[][] arr = {
                {3,4},
                {2,3},
                {1,2}
        };
        int[] out = findRightInterval(arr);
        System.out.println(Arrays.toString(out));
    }
    static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;

        // Step 1: Store start and original index
        int[][] startIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            startIndex[i][0] = intervals[i][0];
            startIndex[i][1] = i;
        }

        // Step 2: Sort by start
        Arrays.sort(startIndex, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Binary search for each interval
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int target = intervals[i][1];
            int left = 0, right = n - 1;
            int index = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (startIndex[mid][0] >= target) {
                    index = startIndex[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[i] = index;
        }

        return result;
    }
}
