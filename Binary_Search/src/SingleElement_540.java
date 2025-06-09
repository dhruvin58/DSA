public class SingleElement_540 {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] arr2 = {3, 3, 7, 7, 10, 11, 11};
        int[] arr3 = {1, 1, 2};

        System.out.println(singleNonDuplicate(arr1)); // Output: 2
        System.out.println(singleNonDuplicate(arr2)); // Output: 10
        System.out.println(singleNonDuplicate(arr3)); // Output: 2
    }
    static public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            }
            else
            {
                end = mid;
            }
        }
        return nums[start];
    }
}
/*
Given a sorted array where every element appears exactly twice except one element, return that single (non-duplicate) element.

Must solve in O(log n) time.

🧠 Key Observations:
Array is sorted → we can use binary search

Every element appears twice — so:

Before the unique element: pairs are like [x,x], [y,y]…

After the unique element: the pairing pattern breaks

So if we look at indexes:

Before the single element:

First of the pair is at even index, second at odd index

After the single element:

This pattern is reversed (i.e., broken)

🔍 Binary Search Strategy:
Use two pointers: start = 0, end = nums.length - 1

Find mid normally, then force mid to be even:

if (mid % 2 == 1) mid--;  // Make sure mid is even
Then compare:

if (nums[mid] == nums[mid + 1]) {
    // Proper pair → unique element is after
    start = mid + 2;
} else {
    // Pair is broken → unique is at mid or before
    end = mid;
}
Loop until start == end → this index is the unique element
 */