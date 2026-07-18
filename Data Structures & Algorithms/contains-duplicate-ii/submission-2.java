// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(map.containsKey(nums[i]))
//             {
//                 int distance = i-map.get(nums[i]);
//          if(distance <= k)
//             {
//                 return true;
//             }
//             }
          
//             map.put(nums[i],i);
//         }
//         return false;
//     }
// }
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int L = 0;

        for (int R = 0; R < nums.length; R++) {
            if (R - L > k) {
                window.remove(nums[L]);
                L++;
            }
            if (window.contains(nums[R])) {
                return true;
            }
            window.add(nums[R]);
        }
        return false;
    }
}