class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int left = 0;
      for(int i : weights)
      {
        left = Math.max(left,i);
      }
      int right =  0;
      for(int wt : weights)
      {
        right += wt;
      }

      while(left <= right)
      {
        int mid = left+(right-left)/2;
           int d = 1;
            int currentWeight = 0;

            for(int wt : weights)
            {
                if(currentWeight + wt > mid)
                {
                    d++;
                    currentWeight = 0;
                }

                currentWeight += wt;
            }

        if(d <= days)
        {
          right = mid - 1;
        }
        else
        {
          left = mid + 1;
        }
      }  
      return left;
    }
}