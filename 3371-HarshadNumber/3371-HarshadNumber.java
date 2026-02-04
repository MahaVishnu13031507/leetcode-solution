// Last updated: 2/4/2026, 8:59:07 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a = 0;
        int b = x;
        while(x!=0){
            a += x%10;
            x /=10;
        }
        if(b%a==0) return a;
        return -1;
    }
}