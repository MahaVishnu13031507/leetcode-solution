// Last updated: 2/4/2026, 8:59:12 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++){
            if (hours[i]>=target)
             c++;
        }return c;
    }
}