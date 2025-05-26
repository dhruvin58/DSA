import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        if (result == true) {
            System.out.println("Prime Number");
        }
        else
            System.out.println("Not Prime Number");

    }
    static boolean isPrime(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
