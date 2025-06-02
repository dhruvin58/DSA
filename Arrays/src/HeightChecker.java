import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        int ans = heightChecker(arr);
        System.out.println(ans);
    }

    static int heightChecker(int[] heights) {
        int count = 0;
        int[] demo = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            demo[i] = heights[i];
        }
        Arrays.sort(demo);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != demo[i]) {
                count++;
            }
        }
        return count;
    }
}
