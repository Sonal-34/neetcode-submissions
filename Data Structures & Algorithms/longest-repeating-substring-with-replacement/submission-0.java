class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to the window
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            // Update the maximum frequency in the current window
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // If the window is invalid, shrink it
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}