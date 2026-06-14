import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RecoverOrder_3668 {
    public static void main(String[] args) {
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};
        System.out.println(Arrays.toString(recoverOrder(order,friends)));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < friends.length; i++) {
                set.add(friends[i]);
            }

            for (int i = 0; i < order.length; i++) {
                if (set.contains(order[i]))
                {
                    list.add(order[i]);
                }
            }

            int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

            return arr;
    }
}
