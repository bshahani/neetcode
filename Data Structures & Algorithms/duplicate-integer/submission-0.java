class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap();

        for (int num: nums) {
            if (frequency.containsKey(num)) 
                frequency.put(num, frequency.get(num) + 1);
            else 
                frequency.put(num, 1);
        }

        for (Map.Entry<Integer, Integer> entry: frequency.entrySet()) {
            if (entry.getValue() > 1)
                return true;
        }

        return false;
    }
}