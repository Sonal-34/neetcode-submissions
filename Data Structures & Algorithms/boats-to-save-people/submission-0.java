class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int left = 0;
        int right = n - 1;
        int count =0;

        while(left < right)
        {
            if(people[left] + people[right] <= limit)
            {
                count++;
                left++;
                right--;
            }
            else 
            {
               count++;
               right--;
            }
        }
        if(left ==  right)
        {
            count++;
        }
        return count;

    }
}