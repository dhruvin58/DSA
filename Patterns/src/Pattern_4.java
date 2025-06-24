/*
*   1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
* */
public class Pattern_4 {
    public static void main(String[] args) {
        int n = 10;
        for (int i=0; i<n; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                System.out.print((char)j+1);
            }
            System.out.println();
        }
    }
}
