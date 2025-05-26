public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr = {10, 20 , 30, 40, 50, 60};
        boolean ans = linearSearch(arr,50);
        System.out.println(ans);

    }

    static boolean linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return false;
        }
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }
}
