public class JudgeCircle_657 {
    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle((moves)));
    }
    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(int i=0; i<moves.length(); i++)
        {
            if(moves.charAt(i) == 'L')
            {
                x++;
            } else if (moves.charAt(i) == 'R') {
                x--;
            } else if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}
