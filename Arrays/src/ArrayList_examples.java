import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_examples {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);

//        System.out.println(list);
        for(int i=0; i<5; i++)
        {
            list.add(sc.nextInt());
        }

        System.out.println(list);
        
        
    }
}
