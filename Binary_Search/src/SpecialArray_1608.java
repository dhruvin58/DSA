public class SpecialArray_1608 {
    public static void main(String[] args)
    {
        int[] arr ={2};
        int ans = specialArray(arr);
        System.out.println(ans);
    }
    static int specialArray(int[] nums) {
        int num = 0;
        while(num <= nums.length)
        {
            int count = 0;
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i] >= num)
                {
                    count++;
                }
            }
            if(count == num)
            {
                return num;
            }
            num++;
        }
        return -1;
    }
}
