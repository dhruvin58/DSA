public class ArrangeCoins_441 {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(arrangeCoins(n));
//        System.out.println(sum(n));

    }
//    static int arrangeCoins(int n) {
//        int count = 0;
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                if(n > i)
//                {
//                    n--;
//                }
//            }
//            count++;
//        }
//        return count;
//    }
    static int arrangeCoins(int n)
    {
        int start = 1;
        int end = n;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int ans = sum(mid);
            if()
        }
    }
    static int sum(int n)
    {   int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum += i;
        }
        return sum;
    }
}
// not completed