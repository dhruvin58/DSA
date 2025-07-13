import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202
{
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
//        Set<Integer> set = new HashSet<>();
//
//        while(n!=1 && !set.contains(n))
//        {
//            set.add(n);
//            n = getSquare(n);
//        }
//        return n == 1;

        int slow = n;
        int fast = n;

        do {
            slow = getSquare(slow);
            fast = getSquare(getSquare(fast));
        }while (slow != fast);

        return fast == 1;

    }
    public static int getSquare(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }

        return sum;
    }
}
