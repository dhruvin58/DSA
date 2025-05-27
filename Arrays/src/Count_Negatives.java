public class Count_Negatives {
    public static void main(String[] args)
    {
        int[][] arr = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans  = countNegatives(arr);
        System.out.println("count of negative form array is : " + ans);
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(grid[i][j] < 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
