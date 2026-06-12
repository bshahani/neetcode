class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int minValue = nums[0];

        while (left <= right) {
            if (nums[left] < nums[right]) {
                minValue = Math.min(minValue, nums[left]);
                break;
            }
            int mid = left + (right - left) / 2;
            minValue = Math.min(minValue, nums[mid]);

            if (nums[mid] >= nums[left]) left = mid + 1;
            else right = mid - 1;
        }

        return minValue;
    }
}
