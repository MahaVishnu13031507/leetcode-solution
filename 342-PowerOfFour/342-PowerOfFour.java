// Last updated: 2/4/2026, 9:00:03 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
    return (n>0&&(n&(n-1))==0)&&(n%3==1);
    }
}