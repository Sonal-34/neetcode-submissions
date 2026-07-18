class Solution {
    public int removeDuplicates(int[] nums) {
        // int i= 0;
        // int j = 1;
        // while(j<nums.length)
        // {
        //     if(nums[i] ==  nums[j])
        //     {
        //         j++;
        //     }
        //     else if(nums[i] != nums[j])
        //     {
                
        //         nums[i+1] =  nums[j];
        //         i++;
        //         j++;
        //     }
        // }
        // return i+1;

        //Edge Case
        if(nums.length == 0)
        {
            return 0;
        }

        int i = 0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }

        }
        return i+1;
    }
}
