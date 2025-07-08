////*********
//// *     *
////  *   *
////   * *
////    *
public class Pattern_14 {
    public static void main(String[] args) {
        int n = 5;
        int width = n*2-1;

        for (int i=0; i<width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int i=1; i<n; i++)
        {
            for (int j=0; j<n*2; j++)
            {
                if (j == i || j == width -1 - i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
