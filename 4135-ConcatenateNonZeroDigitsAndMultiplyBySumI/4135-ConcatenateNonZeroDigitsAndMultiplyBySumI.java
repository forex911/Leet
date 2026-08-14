// Last updated: 8/14/2026, 10:40:45 AM
class Solution {
    public long sumAndMultiply(int n) {
        String tem = Integer.toString(n);
        StringBuilder adder = new StringBuilder();
        long sum = 0;

        for (char x : tem.toCharArray()) {
            int digit = x - '0';

            if (digit != 0) {
                adder.append(x);
                sum += digit;
            }
        }

        if (adder.length() == 0) {
            return 0;
        }

        long concatenatedValue = Long.parseLong(adder.toString());

        return concatenatedValue * sum;
    }
}