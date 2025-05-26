import java.util.Scanner;
public class TwoDimension {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        input
        for(int rows=0; rows<arr.length; rows++)
        {
            for(int col=0; col<arr[rows].length; col++)
            {
                arr[rows][col] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
