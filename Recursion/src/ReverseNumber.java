public class ReverseNumber {
    static int sum = 0;
    static void reverseNumber(int n)
    {
        if(n%10 == 0)
        {
            return;
        }

        int digit = n%10;
        sum = sum*10+digit;

        reverseNumber(n/10);
    }
    public static void main(String[] args) {
        int n = 123;

        reverseNumber(n);
        System.out.println(sum);
    }


}
