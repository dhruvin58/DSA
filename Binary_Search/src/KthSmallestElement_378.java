public class KthSmallestElement_378 {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        System.out.println("Kth Smallest Element is: " + kthSmallest(matrix, k));
    }
    static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n-1][n-1];

        while(start < end)
        {
            int mid = start + (end - start) / 2;
            int count = count(matrix,mid);

            if(count < k)
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
    static int count(int[][] matrix, int mid)
    {
        int n = matrix.length;
        int row = n-1;
        int col = 0;
        int count = 0;

        while(row >= 0 && col < n)
        {
            if(matrix[row][col] <= mid)
            {
                count += row + 1;
                col++;
            }
            else
            {
                row--;
            }
        }
        return count;
    }
}
