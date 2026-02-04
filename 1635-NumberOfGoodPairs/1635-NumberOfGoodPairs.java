// Last updated: 2/4/2026, 8:59:45 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for (int n : freq.values()) {
            res += (n * (n - 1)) / 2;
        }
        return res;
    }
}