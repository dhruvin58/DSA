import java.util.ArrayList;
import java.util.List;

public class CountMatches_1773 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();

        List<String> row1 = new ArrayList<>();
        row1.add("phone");
        row1.add("blue");
        row1.add("pixel");

        List<String> row2 = new ArrayList<>();
        row1.add("computer");
        row1.add("silver");
        row1.add("lenovo");

        List<String> row3 = new ArrayList<>();
        row1.add("phone");
        row1.add("gold");
        row1.add("iphone");

        list.add(row1);
        list.add(row2);
        list.add(row3);

        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(list,ruleKey,ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int ruleKey_ans = findType(ruleKey);
            int count = 0;

            for (List<String> list : items)
            {
                if(list.get(ruleKey_ans).equals(ruleValue))
                {
                    count++;
                }
            }

            return  count;
    }
    static int findType(String ruleKey)
    {
        if(ruleKey.equals("type"))
        {
            return 0;
        }
        else if(ruleKey.equals("color"))
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
}
