class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums); // O(n log n)

        int longestStreak = 0, streak = 0, current = nums[0], i = 0;

        while (i < nums.length) { //O(n)
            if (nums[i] != current) {
                current = nums[i];
                streak = 0;
            } 
            while (i < nums.length && nums[i] == current) {
                i++;
            }

            streak++;
            current++;
            longestStreak = Math.max(streak, longestStreak);
        }

        return longestStreak;

    }
}
