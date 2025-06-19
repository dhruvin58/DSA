public class SearchMatrix_74 {
    public static void mian(String[] args)
    {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;

        System.out.println(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows*cols-1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midElement = matrix[row][col];

            if(midElement == target)
            {
                return true;
            }
            else if(midElement < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return false;
    }
}
