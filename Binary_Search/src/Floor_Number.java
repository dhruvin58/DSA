public class Floor_Number {
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int result = isFloor_number(arr, target);
        if (result == -1) {
            System.out.println("Floor number does not exist.");
        } else {
            System.out.println("Floor number of a given target is: " + result);
        }
    }
    static int isFloor_number(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        if(target < arr[start])
        {
            return -1;
        }
        while(start <= end)
        {
            int mid = (start+end)/2;
            if (target == arr[mid])
            {
                return arr[mid];
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
