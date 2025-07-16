public class R1toN {
    public static void main(String[] args) {
        R1toN(50);
    }
    static void R1toN(int n)
    {
        if (n == 1)
        {
            System.out.println(n);
            return;
        }

        R1toN(n-1);
        System.out.println(n);

    }
}
