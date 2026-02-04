// Last updated: 2/4/2026, 8:59:19 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int takeOnes = Math.min(numOnes, k);
        int sum = takeOnes;
        k -= takeOnes;
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;
        sum -= k; 
        return sum;
    }
}