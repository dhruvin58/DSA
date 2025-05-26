public class OrderAgnosticBS {
    public static void main(String[] args)
    {
        int[] arr = {48,45,40,37,33,24,22,20,18,17,10,6,4,2,1};
        int target = 22;
        int start = 0;
        int end = arr.length-1;

        boolean isASC = arr[start] < arr[end];

        if(isASC == true)
        {
            while(start <= end)
            {
                int mid = (start+end)/2;

                if (target == arr[mid])
                {
                    System.out.println("Target found at " + mid + " position");
                    return;
                }
                else if(target > arr[mid])
                {
                    start = mid+1;
                }
                else if(target < arr[mid]) {
                    end = mid - 1;
                }
            }
            System.out.println("Target Not Found..");
        }
        else
        {
            while(start <= end)
            {
                int mid = (start+end)/2;

                if (target == arr[mid])
                {
                    System.out.println("Target found at " + mid + "position");
                    return;
                }
                else if(target < arr[mid])
                {
                    start = mid+1;
                }
                else if(target > arr[mid]) {
                    end = mid - 1;
                }
            }
            System.out.println("Target Not Found..");
        }

    }
}
