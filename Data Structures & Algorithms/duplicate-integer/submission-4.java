class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> uniqueElements = new HashSet();

        for (int i = 0; i<nums.length; i++) {
            uniqueElements.add(nums[i]);
        }

        if (nums.length > uniqueElements.size())
            return true;

        return false;
    }
}