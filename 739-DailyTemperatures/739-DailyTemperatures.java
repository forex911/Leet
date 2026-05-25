// Last updated: 5/25/2026, 11:09:14 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.push(i);
                continue;
            }
            if (temperatures[st.peek()] > temperatures[i]) {
                res[i] = st.peek() - i;
                st.push(i);
                continue;
            }
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek() - i;
            }
            st.push(i);
        }
        return res;
    }
}