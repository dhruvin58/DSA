import java.util.Arrays;

public class CheckIfExist_1346 {
    public static void main(String[] args)
    {
        int[] arr = {0,0};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int num = arr.length-1;
        while(num >= 0)
        {
            for(int i=0; i<num; i++)
            {
                if(arr[i] * 2 == arr[num])
                {
                    return true;
                }
            }
            num--;
        }

        return false;
    }
}
