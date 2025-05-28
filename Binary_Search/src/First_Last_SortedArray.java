public class First_Last_SortedArray {
    public static void main(String[] args)
    {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int []out = First_Last_Position(arr,target);
        System.out.println(out[0] + " " + out[1]);
    }
    static int[] First_Last_Position(int[] arr, int target)
    {   int[] out = {-1,-1};
        out[0] = search(arr,target,true);
        out[1] = search(arr,target,false);

        return out;
    }
    static int search(int[] arr, int target, boolean isFirst)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                ans = mid;
                if(isFirst)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
