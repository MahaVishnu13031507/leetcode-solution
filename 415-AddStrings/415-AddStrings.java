// Last updated: 2/4/2026, 8:59:56 PM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger sum = number1.add(number2);
        return sum.toString();
    }
}