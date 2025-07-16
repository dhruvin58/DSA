public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(3040,0));
    }
    static int countZeros(int n, int ans)
    {
        if (n == 0)
        {
            return ans;
        }

        int digit = n%10;
        n = n/10;
        if (digit == 0)
        {
            return countZeros(n,ans+1);
        }
        return countZeros(n,ans);
    }
}
