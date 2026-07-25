class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n =s.length();
        int left =0;
        int ryt = 0;
        int maxlen=0;

        while(ryt <n)
        {
            if(!set.contains(s.charAt(ryt)))
            {
                set.add(s.charAt(ryt));
                maxlen =Math.max(maxlen,ryt-left+1);
                ryt++;
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}
