class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Get Frequency of all ints in nums
        Map<Integer, Integer> freqMap = new HashMap<>(); // Space: O(n)
        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Add elements to min-heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // Space: O(k)

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            pq.add(new int[] {entry.getValue(), entry.getKey()});
            if(pq.size() > k)
                pq.poll();
        }

        int[] result = new int[k];
        for (int i = 0; i<k; i++) {
            result[i] = pq.poll()[1];
        }

        return result;

    }
}
