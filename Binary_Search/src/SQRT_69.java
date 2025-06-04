public class SQRT_69 {
    public static void main(String[] args)
    {
        int x = 10;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    static int mySqrt(int x)
    {
        if(x == 0 || x == 1)
        {
            return x;
        }
        int start = 1;
        int end = x;
        int ans = 1;

        while(start <= end)
        {   int mid = start + (end - start) / 2;
            if(mid*mid == x)
            {
                return mid;
            }
            else if(mid*mid < x)
            {
                ans = mid;
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
}
//completed