// Last updated: 9/16/2026, 1:59:40 PM
class Solution {

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);

        while(sumEven != 0) {
            int temp = sumEven;
            sumEven = sumOdd % sumEven;
            sumOdd = temp;
        }

        return Math.abs(sumOdd);
    }
}