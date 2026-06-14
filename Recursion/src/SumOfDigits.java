public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(1342);
        System.out.println("Answer is: " + ans);
    }
    static int sumOfDigits(int number)
    {
        if (number%10==0)
        {
            return 0;
        }  
        return number%10 + sumOfDigits(number/10);
    }
}
