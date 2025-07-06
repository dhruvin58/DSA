import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++)
        {
            boolean flag = true;
            int sum = candies[i] + extraCandies;
            for (int j=0; j<candies.length; j++)
            {
                if(i == j)
                {
                    continue;
                }
                if (sum < candies[j])
                {
                    flag = false;
                    list.add(false);
                    break;
                }
            }
            if(flag)
            {
                list.add(true);
            }
        }
        return list;
    }
}
