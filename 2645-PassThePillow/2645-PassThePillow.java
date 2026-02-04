// Last updated: 2/4/2026, 8:59:22 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = time / (n - 1);
        int remainder = time % (n - 1);
        if (cycle % 2 == 0) {
            return 1 + remainder;
        } else {
            return n - remainder;
        }
    }
}