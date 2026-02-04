// Last updated: 2/4/2026, 9:00:11 PM
class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false; 
        int slow = n, fast = n;
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);
        return slow == 1;
    }
    private int sumOfSquares(int x) {
        int sum = 0;
        while (x > 0) {
            int d = x % 10;
            sum += d * d;
            x /= 10;
        }
        return sum;
    }
}