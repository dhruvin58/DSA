public class CountSteps_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(1));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int n, int c)
    {
        if(n == 0)
        {
            return c;
        }

        if(n%2==0)
        {
            return helper(n/2,c+1);
        }
        else
        {
            return helper(n-1,c+1);
        }
    }
}

