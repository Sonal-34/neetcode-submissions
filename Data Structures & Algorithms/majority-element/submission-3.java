class Solution {
    public int majorityElement(int[] nums) {
         //using Moore's voting algorithm
     int freq = 0;
     int ans = 0;

     for(int i =0;i<nums.length;i++)
     {
        if(freq == 0)
        {
            ans = nums[i];
        }
        if(ans == nums[i])
        {
            freq++;
        }
        else
        {
            freq--;
        }
     }
     return ans;
    }
}