class GuessGame
{
    static int pick;
    public static int guess(int num)
    {
        if(num > pick)
            return -1;
        else if(num < pick)
            return 1;
        else
            return 0;
    }
}
public class GuessNumber extends GuessGame{
    public static void main(String[] args)
    {
        pick = 9;
        int ans = guessNumber(10);
        System.out.println(ans);
    }
    static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int ans = guess(mid);
            if(ans == -1)
            {
                end = mid-1;
            }
            else if(ans == 1)
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
