// * * * * *
//  * * * *
//   * * *
//    * *
//     *
public class Pattern_11 {
    public static void main(String[] args) {
        int rows = 5;

        for (int j=0; j<rows; j++)
        {
            for (int i=0; i<j; i++)
            {
                System.out.print(" ");
            }

            for (int i=0; i<rows-j; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
