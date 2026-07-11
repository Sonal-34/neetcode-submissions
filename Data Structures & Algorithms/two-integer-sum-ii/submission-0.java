class Solution {
    // public int[] twoSum(int[] numbers, int target) {
        
    //     // edge case
    //     if(numbers.length==0)
    //     {
    //         return new int[0];
    //     }
    //     for(int i=0;i<numbers.length;i++)
    //     {
    //         for(int j=i+1;j<numbers.length;j++)
    //         {
    //              if(numbers[i]+numbers[j]==target)
    //              {
    //                 return new int[]{i,j};
    //              }
    //         }
    //     }
    //     return new int[0];
   // }
   public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
        int sum = numbers[left] + numbers[right];

        if (sum == target) {
            return new int[]{left + 1, right + 1}; // 1-indexed
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    return new int[0]; // Will never reach here as per the constraint
}

}
