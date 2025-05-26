import java.util.Arrays;
public class String_Search {
    public static void main(String[] args)
    {
        String str = "Dhruvin";
        char target = 'h';

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
//        boolean ans = search(str,target);
//        System.out.println(ans);
    }

    static boolean search(String str, char target)
    {
        if(str.isEmpty())
        {
            return false;
        }
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == target)
            {
                return true;
            }
        }
        return false;
    }
}
