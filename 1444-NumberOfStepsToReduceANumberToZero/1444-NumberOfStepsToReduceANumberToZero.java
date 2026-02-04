// Last updated: 2/4/2026, 8:59:48 PM
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;   
            } else {
                num -= 1;   
            }
            steps++;
        }
        return steps;
    }
}