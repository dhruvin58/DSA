public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = sumOfDigits(n);
        System.out.println(ans);
    }
    static int sumOfDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }

        int digit = n%10;
        n = n/10;

        return digit+sumOfDigits(n);
    }
}
