import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args)
    {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        for(int num : arr)
        {
            if(count == 0)
            {
                candidate = num;
            }
            if(num == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return candidate;
    }
}

/* This is the Boyer-Moore Voting Algorithm.
*   this prevents majority element from getting cancelled. at last of the array count will be 0 and it reflects actual majority element as candidate
* */
