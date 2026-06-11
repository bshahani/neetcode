class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> freqMap = new HashMap<>();

        for (String s: strs) {

            // Determine key for string s
            int[] indexArr = new int[26];
            for (char c: s.toCharArray()) {
                indexArr[c - 'a']++;
            }
            String key = Arrays.toString(indexArr);

            // add key in map if not present
            freqMap.putIfAbsent(key, new ArrayList<>());


            freqMap.get(key).add(s);

        }

        return new ArrayList<>(freqMap.values());
    }
}
