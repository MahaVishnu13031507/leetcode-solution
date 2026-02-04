// Last updated: 2/4/2026, 8:59:06 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int a=0;
        for (int num:nums){
        if(num%3!=0)
        a++;
    }return a;
}}