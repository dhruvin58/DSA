import java.util.Arrays;

public class CountPrime {
    public static void main(String[] args) {
        int ans = countPrimes(10);
        System.out.println(ans);

    }

    //    static int countPrimes(int n)
//    {
//        int count = 0;
//        for(int i=1; i< n; i++)
//        {
//            if(calcPrimes(i))
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//    static boolean calcPrimes(int num)
//    {
//        if (num < 2)
//        {
//            return false;
//        }
//        for(int i=2; i*i<=num; i++)
//        {
//            if(num%i == 0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
    public static int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] isprime = new boolean[n];
        Arrays.fill(isprime, true);
        isprime[0] = isprime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isprime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isprime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isprime) {
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
/*
* High-Level Idea:
Create a boolean array isPrime[] of size n, and assume all numbers are prime initially.

Then for every number i starting from 2, if i is still marked as prime:

Mark all multiples of i (like 2i, 3i, 4i...) as not prime.

At the end, the values that are still true in isPrime[] are primes.

Example (n = 10)
*
*
* Initial isPrime: [T, T, T, T, T, T, T, T, T, T]  (index = 0 to 9)
Manually set 0 and 1 as non-prime:
=> isPrime = [F, F, T, T, T, T, T, T, T, T]

Start from i = 2:
- 2 is prime → mark 4,6,8 as not prime

Now isPrime = [F, F, T, T, F, T, F, T, F, T]

Next i = 3:
- 3 is prime → mark 6,9 as not prime (6 already marked)

Final isPrime = [F, F, T, T, F, T, F, T, F, F]

Primes < 10: 2, 3, 5, 7 → count = 4 ✅

* */