class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int j=0;j<nums.length;j++)
        {
            if (nums[j] != val) {
                nums[k] = nums[j]; // Copy the valid element to the front
                k++;               // Move to the next position
            }
        }
        return k;
    }
}