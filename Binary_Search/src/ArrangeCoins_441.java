public class ArrangeCoins_441 {
    public static void main(String[] args)
    {
        int n = 15;
        System.out.println(arrangeCoins(n));

    }
    static int arrangeCoins(int n) {
        long start = 0;
        long end = n;

        while(start <= end)
        {
            long mid = start + (end - start) / 2;
            long total = mid *(mid+1) / 2;
            if(total == n)
            {
                return (int)mid;
            }
            else if(total < n)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return (int)end;
    }
}

// long total = mid *(mid+1) / 2; it is just sum of all numbers from 1 to mid to
// check that sum is equal or greater or smaller