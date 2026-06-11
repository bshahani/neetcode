class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int area = 0, maxA = 0, breadth = 0;

        while (i < j) {
            int length = j - i;
            if (heights[i] < heights[j])
                breadth = heights[i];
            else 
                breadth = heights[j];
            
            area = length * breadth;
            
            maxA = Math.max(area, maxA);

            if (heights[i] <= heights[j]) i++;
            else j--;
        }

        return maxA;
    }
}
