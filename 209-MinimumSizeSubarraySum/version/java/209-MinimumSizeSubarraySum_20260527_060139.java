// Last updated: 5/27/2026, 6:01:39 AM
1class Solution {
2
3    public int totalFruit(int[] fruits) {
4
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        int left = 0;
8
9        int ans = 0;
10
11        for (int right = 0; right < fruits.length; right++) {
12
13            map.put(fruits[right],map.getOrDefault(fruits[right], 0) + 1);
14
15            while (map.size() > 2) {
16
17                map.put(fruits[left],map.get(fruits[left]) - 1);
18
19                if (map.get(fruits[left]) == 0) {map.remove(fruits[left]);
20                }
21
22                left++;
23            }
24
25            ans = Math.max(ans,right - left + 1);
26        }
27
28        return ans;
29    }
30}