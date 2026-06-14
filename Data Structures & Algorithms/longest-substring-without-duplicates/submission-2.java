class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<String> charSet = new HashSet<>();
        int i = 0, length = 0;

        for (int j = 0; j < s.length(); j++) {
            while (charSet.contains(String.valueOf(s.charAt(j)))) {
                charSet.remove(String.valueOf(s.charAt(i)));
                i++;
            }

            charSet.add(String.valueOf(s.charAt(j)));
            length = Math.max(length, j - i + 1); //window size : r - l + 1

        }

        return length;
    }

    // abcabcbb

}
