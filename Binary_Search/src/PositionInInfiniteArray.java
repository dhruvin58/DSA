public class PositionInInfiniteArray {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
        int ans = positionInfinite(arr, 10);
        System.out.println(ans);
    }
    static int positionInfinite(int[] arr, int target)
    {
        int start = 0;
        int end = 1;
        boolean flag = false;

        while(flag != true)
        {
            if(target > arr[end])
            {
                start = end+1;
                end = start*2;
            }
            else if(target >= arr[start] && target <= arr[end])
            {
                while(start <= end)
                {
                    int mid = start + (end - start) / 2;
                    if(target > arr[mid])
                    {
                        start = mid + 1;
                    }
                    else if(target < arr[mid])
                    {
                        end = mid-1;
                    }
                    else
                    {
                        flag = true;
                        return mid;
                    }
                }
            }
        }
        return -1;
    }

}
