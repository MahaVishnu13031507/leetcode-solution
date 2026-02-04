// Last updated: 2/4/2026, 8:59:32 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : 2 * n;
    }
}