// Last updated: 2/4/2026, 8:58:53 PM
class Solution {
    public int countMonobit(int n) {
        int count = 1; 
        int k = 1;
        while ((1 << k) - 1 <= n) {
            count++;
            k++;
        }
        
        return count;
    }
}