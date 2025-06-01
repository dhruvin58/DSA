public class RemoveDuplicates {
    public static void main(String[] args)
    {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans =  removeDuplicates(arr);
        System.out.println(ans);
    }
    static int removeDuplicates(int[] nums)
    {
        int[] demo = new int[nums.length];
        int unique = 0;
        int count = 0;
        int k=0;

        demo[k++] = nums[0];
        count++;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != nums[unique])
            {
                demo[k++] = nums[i];
                unique = i;
                count++;
            }

        }
        for(int i=0; i<nums.length-1; i++)
        {
            nums[i] = demo[i];
        }
        return count;
    }
}
