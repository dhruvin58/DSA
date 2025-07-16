import java.util.Collections;
import java.util.PriorityQueue;

public class MinMaxSum
{
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 2, 6};
        int n = 2; // number of elements to remove

        int maxSum = minSum(arr, n);
        int minSum = maxSum(arr, n);

        System.out.println("Maximum sum after removing " + n + " elements: " + maxSum);
        System.out.println("Minimum sum after removing " + n + " elements: " + minSum);
    }
    static int minSum(int[] arr, int n) {
//        boolean[] removed = new boolean[arr.length];
//
//        for (int i = 0; i < n; i++) {
//            int minIdx = -1;
//            for (int j = 0; j < arr.length; j++) {
//                if (!removed[j] && (minIdx == -1 || arr[j] < arr[minIdx])) {
//                    minIdx = j;
//                }
//            }
//            removed[minIdx] = true;
//        }
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (!removed[i])
//            {
//                sum += arr[i];
//            }
//        }
//
//        return sum;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int value : arr)
        {
            minHeap.add(value);
        }

        for (int i=0; i<n; i++)
        {
            minHeap.poll();
        }

        int sum = 0;
        while (!minHeap.isEmpty())
        {
            sum += minHeap.poll();
        }

        return sum;
    }
    static int maxSum(int[] arr, int n) {
//        boolean[] removed = new boolean[arr.length];
//
//        for (int i = 0; i < n; i++) {
//            int minIdx = -1;
//            for (int j = 0; j < arr.length; j++) {
//                if (!removed[j] && (minIdx == -1 || arr[j] > arr[minIdx])) {
//                    minIdx = j;
//                }
//            }
//            removed[minIdx] = true;
//        }
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (!removed[i])
//            {
//                sum += arr[i];
//            }
//        }
//
//        return sum;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int val : arr)
        {
            maxHeap.add(val);
        }

        for (int i=0; i<n; i++)
        {
            maxHeap.poll();
        }

        int sum = 0;
        while (!maxHeap.isEmpty())
        {
            sum += maxHeap.poll();
        }

        return sum;
    }
}