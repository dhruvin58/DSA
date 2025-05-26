public class Max_Wealth {
    public static void main(String[] args)
    {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,10}
        };

        int[] arr = new int[accounts.length];
        for(int i=0; i<accounts.length; i++)
        {
            int result = 0;
            for(int j=0; j<accounts[i].length; j++)
            {
                result = result + accounts[i][j];
            }
            arr[i] = result;
        }
        int max = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1] > max)
            {
                max = arr[i+1];
            }
        }
        System.out.println(max);
    }
}
