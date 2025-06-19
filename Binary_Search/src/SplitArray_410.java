public class SplitArray_410 {
    public static void main(String[] args)
    {
        int[] arr ={7,2,5,10,8};
        int k=2;
        int ans = splitArray(arr,k);
        System.out.println(ans);
    }
    static int splitArray(int[] nums, int k)
    {
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++)
        {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start < end)
        {
            int totalSum = 0;
            int pieces = 1;
            int mid = start + (end - start) / 2;
            for(int num : nums)
            {
                if(totalSum + num > mid)
                {
                    pieces++;
                    totalSum = num;
                }
                else
                {
                    totalSum += num;
                }
            }

            if(pieces <= k)
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return start;
    }
}
 /*

 Question is :

 [7] = 7, [2,5,10,8] = 25 -> 25
 [7,2] = 9, [5,10,8] = 23 -> 23
 [7,2,5] = 14, [10,8] = 18 -> 18
 [7,2,5,10] = 24, [8] = 8 -> 24

 so from above sums we have to take minimum which is 18 so that is our answer

 ANSWER :
 
 in this example first we have to find out the range means which in between minimum and maximum so

 for minimum, we can put all individual element in separate array like [1], [2], [5] and so on so from this our maximum is 10 so this our start in binary search

 and for maximum we can do sum of the all the elements which is 32 so our answer is lies between 10 and 32

 now we find out the mid, and we put every element of array in sum by checking that if it is exceeding mid or not ??

 if it not we will keep adding it until it exceeds or if it is then we will create new sub array means we will add that num in new partition and increase the pieces by one

 now we will check that if pieces we got is less than or equal to k which is given then we put mid as our new end and if not then start = mid+1

 simple at the end both start and end will point to one element and that is our answer
  */