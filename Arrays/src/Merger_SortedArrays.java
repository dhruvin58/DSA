import java.util.Arrays;

public class Merger_SortedArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,0,0,0};
        int m=3;
        int[] arr2 = {2,5,6};
        int n = 3;
        merge(arr1,m,arr2,n);
    }
        static void merge(int[] nums1, int m, int[] nums2, int n) {
            int k=0;
            for(int i=m; i<nums1.length; i++)
            {
                nums1[i] = nums2[k];
                k++;
            }
            for (int i = 0; i < nums1.length - 1; i++) {
                for (int j = 0; j < nums1.length - 1 - i; j++) {
                    if (nums1[j] > nums1[j + 1]) {
                        int temp = nums1[j];
                        nums1[j] = nums1[j + 1];
                        nums1[j + 1] = temp;
                    }
                }
            }
            for(int i=0; i<nums1.length; i++)
            {
                System.out.println(nums1[i]);
            }
        }
}
