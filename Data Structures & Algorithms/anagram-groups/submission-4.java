class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
       // Loop through all words
        for (int i = 0; i < strs.length; i++) {

            String word = strs[i];

            // Count letters
            int[] freq = new int[26];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                freq[c - 'a']++;
            }

            // Convert frequency array to key
            String key = Arrays.toString(freq);

            // Grouping using if
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        // Convert map to result list
        return new ArrayList<>(map.values());
    }
}
