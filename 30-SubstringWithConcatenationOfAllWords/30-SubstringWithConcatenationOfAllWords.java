// Last updated: 5/25/2026, 11:13:13 AM
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return ans;

        int n = s.length(), m = words.length, l = words[0].length();
        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words) wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);

        for (int i = 0; i < l; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int left = i, count = 0;
            for (int j = i; j <= n - l; j += l) {
                String sub = s.substring(j, j + l);
                if (wordCount.containsKey(sub)) {
                    seen.put(sub, seen.getOrDefault(sub, 0) + 1);
                    count++;
                    while (seen.get(sub) > wordCount.get(sub)) {
                        String leftWord = s.substring(left, left + l);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        count--;
                        left += l;
                    }
                    if (count == m) ans.add(left);
                } else {
                    seen.clear();
                    count = 0;
                    left = j + l;
                }
            }
        }
        return ans;
    }
}