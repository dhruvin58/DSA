public class PetersonNumber {
    public static void main(String[] args) {

        System.out.println(petersonNumber(145));
    }
    static boolean petersonNumber(int n)
    {
        int sum = 0;

        String s = String.valueOf(n);
        for (char ch : s.toCharArray())
        {
            int num = ch - '0';
            int ans = findFactorial(num);
            sum += ans;
        }
        return sum == n;
    }
    static int findFactorial(int n)
    {
        int fact = 1;
        int i=1;
        while (i<=n)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
