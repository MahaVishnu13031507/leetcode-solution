// Last updated: 2/4/2026, 8:59:44 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;   
        int empty = numBottles;   
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   
            total += newBottles;                    
            empty = empty % numExchange + newBottles; 
        }
        return total;
    }
}