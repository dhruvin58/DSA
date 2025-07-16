public class Nto1 {
    public static void main(String[] args) {
        printNTO1(50);
    }
    static void printNTO1(int n)
    {
        if (n == 1)
        {
            System.out.println(1);
            return;
        }

        System.out.println(n);

        printNTO1(n-1);
    }
}
