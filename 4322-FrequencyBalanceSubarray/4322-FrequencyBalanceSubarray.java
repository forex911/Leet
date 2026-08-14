// Last updated: 8/14/2026, 10:40:48 AM
import java.util.*;

class Solution {
    public int getLength(int[] nums) {
        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> freq = new HashMap<>();
            Map<Integer, Integer> freqCount = new HashMap<>();

            for (int j = i; j < n; j++) {
                int x = nums[j];

                int oldFreq = freq.getOrDefault(x, 0);

                if (oldFreq > 0) {
                    freqCount.put(oldFreq, freqCount.get(oldFreq) - 1);
                    if (freqCount.get(oldFreq) == 0) {
                        freqCount.remove(oldFreq);
                    }
                }

                int newFreq = oldFreq + 1;
                freq.put(x, newFreq);
                freqCount.put(newFreq,
                        freqCount.getOrDefault(newFreq, 0) + 1);

                if (isValid(freq, freqCount)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private boolean isValid(Map<Integer, Integer> freq,
                            Map<Integer, Integer> freqCount) {

        // Only one distinct value
        if (freq.size() == 1) {
            return true;
        }

        // Need exactly two frequencies
        if (freqCount.size() != 2) {
            return false;
        }

        Iterator<Integer> it = freqCount.keySet().iterator();

        int a = it.next();
        int b = it.next();

        int f1 = Math.min(a, b);
        int f2 = Math.max(a, b);

        // Frequencies must be f and 2f
        return f2 == 2 * f1;
    }
}