//       *****
//        ****
//         ***
//          **
//           *

public class Pattern_7 {
    public static void main(String[] args) {
        int n = 6;
        for (int i=0; i<n; i++)
        {
            for(int j=1; j<i+1; j++)
            {
                System.out.print(" ");
            }
            for(int j=n; j>i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
