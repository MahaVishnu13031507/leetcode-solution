// Last updated: 2/4/2026, 9:00:18 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == 0) {
                int t = nums[low];
                nums[low] = nums[i];
                nums[i] = t;
                low++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else { 
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j--;
            }
        }
    }
}