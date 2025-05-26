public class Even_Digit {
    public static void main(String[] args)
    {
        int[] arr = {12,345,22,66,7896};
        int result = 0;
        for(int i=0; i<arr.length; i++)
        {
            int temp_num = arr[i];
            int temp_count = 0;
            while(temp_num != 0)
            {
                int rem = temp_num%10;
                temp_num = temp_num/10;
                temp_count++;
            }
            if (temp_count % 2 == 0)
            {
                result++;
            }
        }

        System.out.println(result);
    }
}
