import java.util.Scanner;
import java.util.Arrays;
public class Array_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int j : arr)
        {
            System.out.println(j + "");
        }

        System.out.println(Arrays.toString(arr));
    }
}
