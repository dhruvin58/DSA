public class AlternatePrimeNumbers {
    public static void main(String[] args) {
        alternatePrimeNumbers();
    }
    static void alternatePrimeNumbers()
    {
        boolean flag = true;
        for (int i = 2; i <= 100; i++) {
            if (checkPrime(i))
            {
                if (flag) {
                    System.out.println(i);
                    flag = false;
                }
                else
                {
                    flag = true;
                }
            }
        }
    }
    static boolean checkPrime(int n)
    {
        if (n < 2)
        {
            return false;
        }
        for (int i = 2; i*i <=n ; i++) {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
