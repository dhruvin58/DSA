public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,14,5};
        System.out.println(checkSortedArray(arr,0));
    }
    static boolean checkSortedArray(int[] arr, int index)
    {
        if (index == arr.length-1)
        {
            return true;
        }

        return arr[index] < arr[index+1] && checkSortedArray(arr, index+1);
    }
}
