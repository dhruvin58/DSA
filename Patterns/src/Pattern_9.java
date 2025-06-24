//     *********
//      *******
//       *****
//        ***
//         *
public class Pattern_9 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=0; i<rows; i++)
        {

            for (int j=0; j<i; j++)
            {
                System.out.print(" ");
            }

            for (int j=0; j < 2*rows-2*i-1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
