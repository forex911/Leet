// Last updated: 7/24/2026, 5:26:22 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        Set<Integer> uniqueValues = new HashSet<>();
4        for(int num:nums)
5        {
6            uniqueValues.add(num);
7        }
8        final int MAX_XOR = 2048;
9        boolean[] reachablePairXor = new boolean[MAX_XOR];
10        boolean[] reachableTripletXor = new boolean[MAX_XOR];
11        for(int first:uniqueValues)
12        {
13            for(int second:uniqueValues)
14                reachablePairXor[first^second] = true;
15        }
16        for(int xorValue = 0; xorValue < MAX_XOR; xorValue++)
17        {
18            if(!reachablePairXor[xorValue])
19                continue;
20            for(int third: uniqueValues)
21                reachableTripletXor[xorValue^third] = true;
22        }
23        int uniqueTriplets = 0;
24        for(boolean reachable : reachableTripletXor)
25        {
26            if(reachable)
27                uniqueTriplets++;
28        }
29        return uniqueTriplets;
30    }
31}