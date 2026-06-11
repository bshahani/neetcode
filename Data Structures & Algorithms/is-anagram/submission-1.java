class Solution {
    public boolean isAnagram(String s, String t) {
        // Edge cases
        // 1. Check length of 2 strings
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> mapStringS = new HashMap();

        for (char c: s.toCharArray()) {
            if (mapStringS.containsKey(c))
                mapStringS.put(c, mapStringS.get(c)+1);
            else
                mapStringS.put(c, 1); 
        }

        // Check if String t has the same letter frequency as String s
        Map<Character, Integer> mapStringT = new HashMap();

        for (char c: t.toCharArray()) {
            if (mapStringT.containsKey(c))
                mapStringT.put(c, mapStringT.get(c)+1);
            else
                mapStringT.put(c, 1); 
        }

        return mapStringT.equals(mapStringS);

    }
}
