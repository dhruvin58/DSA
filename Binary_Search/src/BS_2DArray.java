// This is the implementation of row wise and column wise sorted 2d array
import java.util.Arrays;

public class BS_2DArray {
    public static void main(String[] args)
    {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,50)));
    }
    static int[] search(int[][] arr, int target)
    {
        int row = 0;
        int column = arr.length-1;

        while(row < arr.length-1 && column >= 0)
        {
            if(arr[row][column] == target)
            {
                return new int[]{row,column};
            }
            else if(target < arr[row][column])
            {
                column--;
            }
            else
            {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
