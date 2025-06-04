public class PerfectSquare {
    public static void main(String[] args)
    {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int ans = mySqrt(num);
        if(ans == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int mySqrt(int x)
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
            if((long)mid*mid == x)
            {
                return mid;
            }
            else if((long)mid*mid < x)
            {
                ans = mid;
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
}
