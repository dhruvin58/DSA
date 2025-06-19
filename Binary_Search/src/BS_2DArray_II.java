import java.util.Arrays;

public class BS_2DArray_II {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,  3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 30;
        System.out.println(Arrays.toString(search(matrix,target)));

    }
    static int[] search(int[][] matrix, int target)
    {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return new int[]{-1,-1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows*cols-1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int row = mid/cols;
            int col = mid%cols;

            if(matrix[row][col] == target)
            {
                return new int[]{row,col};
            }
            else if(matrix[row][col] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
