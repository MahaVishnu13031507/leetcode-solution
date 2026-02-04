// Last updated: 2/4/2026, 9:00:07 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int as=0;
        int ex=n*(n+1)/2;
        for (int num :nums){
             as+=num;
        }return ex -as;
    }
}