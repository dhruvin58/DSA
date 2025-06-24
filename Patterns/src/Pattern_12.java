// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
public class Pattern_12 {
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
        for (int i=1; i<rows; i++)
        {

            for (int j=0; j<rows-i-1;j++)
            {
                System.out.print(" ");
            }

            for (int j=0; j<i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
