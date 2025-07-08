//    *
//   * *
//  *   *
// *     *
//*********
public class Pattern_13 {
    public static void main(String[] args) {
        int n=5;
        int width = n*2-1;

        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n*2-1; j++)
            {
                if (j == (n - 1 - i) || j == (n - 1 + i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0; i<width; i++)
        {
                System.out.print("*");
        }

    }
}
