import java.util.ArrayList;
import java.util.Scanner;
public class MultidimensionArraylist {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++)
        {
            list.add(new ArrayList<>());
        }

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
