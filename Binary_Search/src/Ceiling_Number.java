public class Ceiling_Number {
        public static void main(String[] args)
        {
            int[] arr = {2,3,5,9,14,16,18};
            int target = 18;
            int result = isCeiling_number(arr, target);
            if (result == -1) {
                System.out.println("Ceiling number does not exist.");
            } else {
                System.out.println("Ceiling number of a given target is: " + result);
            }
        }
        static int isCeiling_number(int[] arr, int target)
        {
            int start = 0;
            int end = arr.length-1;

            if(target > arr[end])
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
            return arr[start];
        }
}
