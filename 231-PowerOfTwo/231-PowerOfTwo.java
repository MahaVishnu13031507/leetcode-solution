// Last updated: 2/4/2026, 9:00:09 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
    return n>0&&(n&(n-1))==0;
    }
}