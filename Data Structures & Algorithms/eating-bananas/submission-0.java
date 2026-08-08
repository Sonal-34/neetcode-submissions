class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 ;
        int right = 0;

        for (int pile : piles)
         {
             right = Math.max(right, pile);
         }   

        while(left <= right)
        {
              int  mid = left + (right - left) / 2;
              int hours = 0;
             
            // Calculate total hours needed at speed mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            // Now check whether this speed works
            if (hours <= h) {

                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }
}
