import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args)
    {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
        rotate(arr);
    }
    public static void rotate(int[][] matrix)
    {   int n = matrix.length-1;
//        for(int i=0; i<n; i++)
//        {
//            for(int j=0; j<n; j++)
//            {
//                for(int k=j; k<j+1; k++)
//                {
//                    matrix[k][n-i] = matrix[i][j];
//                }
//            }
//        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
