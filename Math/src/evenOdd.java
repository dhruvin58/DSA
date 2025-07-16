public class evenOdd {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(evenOdd(n));
    }
    static String evenOdd(int n)
    {
        if ((n&1) == 1)
        {
            return "odd";
        }
        else
        {
            return "even";
        }
    }
}
