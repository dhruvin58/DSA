import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number... :");
        int num = sc.nextInt();
        System.out.println("Enter Your Power of that number..:");
        int power = sc.nextInt();
        boolean result = isArmstrong(num,power);
        if (result == true)
        {
            System.out.println("Number is Armstrong number..");
        }
        else
        {
            System.out.println("Number is not an Armstrong Number..");
        }
    }

    static boolean isArmstrong(int n, int p)
    {   int original = n;
        int result = 0;
        while(n != 0)
        {
            int temp_result = 1;
            int rem = n%10;
            System.out.println("rem :" + rem);
            n = n/10;
            System.out.println("Number remained : " + n);
            for(int j=0;j<p; j++)
            {
                temp_result *= rem;
            }
            result += temp_result;
        }
        if (result == original)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
